package esLoading;
import Utility.*;

public class esLoading08 {
    
        public void nombreCarga(){
            System.out.print("Ingrese su nombre: ");
            String nombre = Lector.sc.nextLine();
            System.out.print("Ingrese su apellido: ");
            String apellido = Lector.sc.nextLine();
            String nombreCompleto = nombre + " " + apellido;
            int totalSteps = 20; // Longitud de la barra de carga
            for (int i = 0; i <= totalSteps; i++) {
                StringBuilder barraCarga = new StringBuilder();
                int porcentaje = i * 5; // Calcula el porcentaje de carga (0% a 100%)
                for (int j = 0; j < totalSteps; j++) {
                    if (j < i) {
                        barraCarga.append(nombreCompleto.charAt(j % nombreCompleto.length())); // Agrega el carácter del nombre
                    } else if (j == i) {
                        barraCarga.append("|"); // Agrega un separador al final
                    } else {
                        barraCarga.append(" "); // Espacios en las otras posiciones
                    }
                }
                System.out.print("\rCargando [" + barraCarga.toString() + "] " + porcentaje + "%");
                try {
                    Thread.sleep(100); // Simula un tiempo de carga
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // Restaurar el estado de interrupción
                    System.err.println("Carga interrumpida");
                }
            }
            System.out.println(); // Salto de línea final
        }
}
