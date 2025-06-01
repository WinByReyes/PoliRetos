package dsCadenas;
import java.util.Scanner;

public class emC09 {

    /**
     * Pide una frase y la presenta una letra mayuscula y otra minuscula
     * alternando entre mayúsculas y minúsculas.
     */
    public void emFrase09() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();
        
        StringBuilder fraseAlternada = new StringBuilder();
        boolean mayuscula = true;
        for(int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            if (Character.isLetter(letra)) { 
                if(mayuscula){
                    fraseAlternada.append(Character.toUpperCase(letra));
                } else {
                    fraseAlternada.append(Character.toLowerCase(letra));
                }
                mayuscula = !mayuscula; // Solo alterna si es una letra
            } else {
                fraseAlternada.append(letra); // Mantiene espacios y signos iguales
            }
        }
        System.out.println("La frase alternada es: " + fraseAlternada);
    }
}
