package emArrays;
import Utility.*;

public class emA05 {
    
    @SuppressWarnings("resource")

    public void emMatrizNomCuadrada() {
        
        String nombreCompleto;
        boolean inputValido = false;

        // Validar entrada: no espacios al inicio y al menos dos palabras
        do {
            System.out.println("Ingrese su nombre completo (nombres y apellidos):");
            nombreCompleto = Lector.sc.nextLine().trim();

            if (nombreCompleto.isEmpty() || nombreCompleto.startsWith(" ")) {
                System.out.println("Por favor, no ingrese espacios antes del nombre.");
                continue;
            }
            if (!nombreCompleto.contains(" ")) {
                System.out.println("Debe ingresar al menos un nombre y un apellido.");
                continue;
            }
            inputValido = true;
        } while (!inputValido);

        // Eliminar espacios para la matriz
        String nombreSinEspacios = nombreCompleto.replaceAll("\\s+", "");
        int emTam = nombreSinEspacios.length();
        String[][] emMatriz = new String[emTam][emTam];

        // Inicializar matriz con espacios
        for (int i = 0; i < emTam; i++)
            for (int j = 0; j < emTam; j++)
                emMatriz[i][j] = " ";

        // Para cada letra, elige una columna aleatoria en su fila (sin repetir)
        for (int i = 0; i < emTam; i++) {
            boolean colocado = false;
            int intentos = 0;
            while (!colocado && intentos < emTam) {
                int col = (int) (Math.random() * emTam);
                if (emMatriz[i][col].equals(" ")) {
                    emMatriz[i][col] = String.valueOf(nombreSinEspacios.charAt(i));
                    colocado = true;
                }
                intentos++;
            }
            // Si no encontró columna libre (muy raro), pon un *
            if (!colocado) {
                for (int j = 0; j < emTam; j++) {
                    if (emMatriz[i][j].equals(" ")) {
                        emMatriz[i][j] = "*";
                        break;
                    }
                }
            }
        }

        // Imprimir la matriz final
        System.out.println("\nMatriz con cada letra de su nombre de forma aleatoria:\n");
        for (int i = 0; i < emTam; i++) {
            for (int j = 0; j < emTam; j++) {
                System.out.print(emMatriz[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
