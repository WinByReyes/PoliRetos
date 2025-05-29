package emCadena;
import java.util.Scanner;

public class emC04 {

    /**
     * Pide frase y letra y devuelve la frase sin la letra indicada.
     * @param frase La frase de entrada.
     * @param letra La letra a eliminar de la frase.
     * @return La frase sin la letra indicada.
     */

    public void emFrase04(String frase, char letra) {
        String nuevafrase = "";
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != letra) {
                nuevafrase += frase.charAt(i);
            }
        }
        System.out.println("La frase: '" + frase + "' sin la letra " + letra + " es: " + nuevafrase);
    }

    //Metodo para pedir la frase y la letra al usuario
    public void fraseFinal() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();
        System.out.print("Introduce una letra a eliminar de la frase: ");
        char letra = sc.next().charAt(0);
        emFrase04(frase, letra);
    }
}