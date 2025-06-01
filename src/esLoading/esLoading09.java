package esLoading;
import Utility.*;

public class esLoading09 {
    public String nombreApellido() {

                System.out.print("Ingrese su nombre: ");
                String nombre = Lector.sc.nextLine();
                System.out.print("Ingrese su apellido: ");
                String apellido = Lector.sc.nextLine();
                return nombre + " " + apellido; // Devuelve el nombre completo
            }
    public void nombreCompleto() {
         //llama a la funcion nombre y apellido
            String nombreCompleto = nombreApellido();
            System.out.println("Nombre completo: " + nombreCompleto);
         
            //Pedir y mostrar el nombre completo, mostrando solo una letra en la misma linea 0% hasta 100% 
            int totalSteps = nombreCompleto.length(); // Longitud del nombre completo
            for (int i = 0; i < totalSteps; i++) {
                StringBuilder barraCarga = new StringBuilder();
                int porcentaje = (i + 1) * 100 / totalSteps; // Calcula el porcentaje de carga
                barraCarga.append(nombreCompleto.charAt(i)); // Agrega el carácter del nombre
                System.out.print("\rCargando [" + barraCarga.toString() + "] " + porcentaje + "%");
                try {
                    Thread.sleep(100); // Simula un tiempo de carga
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // Restaurar el estado de interrupción
                    System.err.println("Carga interrumpida");
                }
            }
        }	
}
