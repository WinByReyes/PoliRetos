package emCadena;
import java.util.Scanner;

public class emC05 {

    /**
     * Pide una frase y la presenta invertida con las vocales en mayúsculas.
     */
    public void emFrase05() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();
        
        StringBuilder fraseInvertida = new StringBuilder(); // Invertir la frase y convertir vocales a mayúsculas
        for (int i = frase.length() - 1; i >= 0; i--) {
            char letra = frase.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {  // Convertir vocales a mayúsculas
                fraseInvertida.append(Character.toUpperCase(letra));
            } else {
                fraseInvertida.append(letra);
            }
        }
        System.out.println("La frase invertida es: " + fraseInvertida);
    }
    
}
