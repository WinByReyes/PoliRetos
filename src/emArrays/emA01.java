package emArrays;
import Utility.*;

public class emA01 {

    public void emMostrarCargaNombre() {
        int n = 0;
        // Pedir cantidad de nombres con validación simple
        do {
            System.out.print("¿Cuántos nombres quieres ingresar? ");
            try {
                n = Integer.parseInt(Lector.sc.nextLine());
                if (n <= 0) System.out.println("Debe ingresar un número positivo.");
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida, ingrese un número.");
            }
        } while (n <= 0);

        String[] emNombres = new String[n];
        int[] emPorcentajes = new int[n];

        // Pedir nombres usando el método de Lector
        for (int i = 0; i < n; i++) {
            emNombres[i] = Lector.pedirPalabraValida();
        }

        // Pedir porcentajes con validación simple
        System.out.println("Ingrese el porcentaje de carga para cada nombre (separado por espacios):");
        for (int i = 0; i < n; i++) {
            int porcentaje = -1;
            do {
                System.out.printf("Porcentaje para %s: ", emNombres[i]);
                try {
                    porcentaje = Integer.parseInt(Lector.sc.nextLine());
                    if (porcentaje < 0 || porcentaje > 100) {
                        System.out.println("El porcentaje debe estar entre 0 y 100.");
                        porcentaje = -1;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida, ingrese un número.");
                }
            } while (porcentaje == -1);
            emPorcentajes[i] = porcentaje;
        }

        // Mostrar resultados
        for (int i = 0; i < n; i++) {
            String emBarra = emGenerarBarraCarga(emPorcentajes[i]);
            int emLetras = (int) Math.round((emNombres[i].length() * emPorcentajes[i]) / 100.0);
            String emRecorte = emNombres[i].substring(0, Math.max(1, emLetras));
            System.out.printf("%s: %3d%% %s\n", emBarra, emPorcentajes[i], emRecorte);
        }
    }

    private String emGenerarBarraCarga(int porcentaje) {
        int emTotal = 15;
        int emLlenos = (int) Math.round((porcentaje / 100.0) * emTotal);
        StringBuilder emBarra = new StringBuilder("[");
        for (int i = 0; i < emLlenos; i++) emBarra.append("=");
        emBarra.append(">");
        for (int i = emLlenos + 1; i < emTotal; i++) emBarra.append(" ");
        emBarra.append("]");
        return emBarra.toString();
    }
}
