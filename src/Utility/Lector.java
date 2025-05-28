package Utility;

import java.util.Scanner;
public class Lector {
    public static Scanner sc = new Scanner(System.in);

    public static String leerFrase() {
        System.out.print("Ingrese una frase (MAX 150): ");
        return sc.nextLine();
    }

    public static String leerPalabra(){
         System.out.print("Ingrese la vocal a eliminar: ");
         return sc.nextLine();
    }
}


