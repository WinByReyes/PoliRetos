package Utility;

import java.util.Scanner;
public class Lector {
    public static Scanner sc = new Scanner(System.in);
    //Leer frase para cadenas
    public static String leerFrase() {
        System.out.print("Ingrese una frase (MAX 150): ");
        return sc.nextLine();
    }
    //Leer vocales para cadena
    public static String leerPalabra(){
         System.out.print("Ingrese la vocal a eliminar: ");
         return sc.nextLine();
    }

    private static final String VOCALS = "aeiouáéíóúAEIOUÁÉÍÓÚ";
        private static final Scanner scanner = new Scanner(System.in);

        
        public static char pedirVocal() {
            while (true) {
                System.out.print("Ingrese una vocal: ");
                String input = scanner.nextLine().trim();

                if (input.isEmpty()) {
                    System.out.println("No ingresó ninguna letra. Intente de nuevo.");
                    continue;
                }

                char letra = input.charAt(0);
                if (VOCALS.indexOf(letra) != -1) {
                    return letra;
                } else {
                    System.out.println("No es una vocal válida. Intente de nuevo.");
                }
            }
        }

        public static char pedirLetra() {
        while (true) {
            System.out.print("Ingrese una letra: ");
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("No ingresó ninguna letra. Intente de nuevo.");
                continue;
            }

            if (input.length() > 1) {
                System.out.println("Debe ingresar solo una letra. Intente de nuevo.");
                continue;
            }

            char letra = input.charAt(0);

            if (Character.isLetter(letra)) {
                return letra;
            } else {
                System.out.println("El carácter ingresado no es una letra válida. Intente de nuevo.");
            }
        }
    }

    public static String pedirPalabraValida() {
    while (true) {
        System.out.print("Ingrese una palabra: ");
        String input = sc.nextLine().trim();

        if (input.isEmpty()) {
            System.out.println("No ingresó ninguna palabra. Intente de nuevo.");
            continue;
        }

        // Aquí podrías agregar otras validaciones, como sólo letras, etc.
        if (input.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ]+")) {
            return input;
        } else {
            System.out.println("La palabra contiene caracteres inválidos. Intente de nuevo.");
        }
    }
}
}


