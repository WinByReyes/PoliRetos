package emArrays;
import Utility.*;;

public class emA04 {

    public void emMostrarNombreCruz() {
    System.out.print("Introduce tu nombre: ");
    String emNombre = Lector.sc.nextLine().trim();
    System.out.print("Introduce tu apellido: ");
    String emApellido = Lector.sc.nextLine().trim();

    int emTam = Math.max(emNombre.length(), emApellido.length());
    String[][] emMatriz = new String[emTam][emTam];

    // Llenar la matriz con espacios
    for (int i = 0; i < emTam; i++) {
        for (int j = 0; j < emTam; j++) {
            emMatriz[i][j] = " ";
        }
    }

    // Colocar letras del nombre en la diagonal principal
    for (int i = 0; i < emNombre.length(); i++) {
        emMatriz[i][i] = String.valueOf(emNombre.charAt(i));
    }

    // Colocar letras del apellido en la diagonal secundaria
    for (int i = 0; i < emApellido.length(); i++) {
        int col = emTam - 1 - i;
        // Si ya hay una letra (intersección), concatena ambas
        if (!emMatriz[i][col].equals(" ")) {
            emMatriz[i][col] += emApellido.charAt(i);
        } else {
            emMatriz[i][col] = String.valueOf(emApellido.charAt(i));
        }
    }

    // Imprimir la matriz
    for (int i = 0; i < emTam; i++) {
        for (int j = 0; j < emTam; j++) {
            System.out.print(emMatriz[i][j] + " ");
        }
        System.out.println();
    }
    }
    

}
