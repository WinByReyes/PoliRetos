package dsCadenas;
import Utility.*;

public class emC04 {

    char letra = Lector.pedirLetra();

    public void emFrase04(String frase) {
        System.out.println(colors.AZUL);
        String nuevafrase = "";
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != letra) {
                nuevafrase += frase.charAt(i);
            }
        }
        System.out.println(colors.AZUL+ "La frase: '" + frase +colors.RESET
                + colors.ROJO+ "' sin la letra " + letra + colors.RESET+ colors.AMARILLO+ " es: " + nuevafrase + colors.RESET);
    }

    
}