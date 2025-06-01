package dsCadenas;
import Utility.*;

public class emC04 {

    char letra = Lector.pedirLetra();

    public void emFrase04(String frase) {
        String nuevafrase = "";
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != letra) {
                nuevafrase += frase.charAt(i);
            }
        }
        System.out.println("La frase: '" + frase + "' sin la letra " + letra + " es: " + nuevafrase);
    }

    
}