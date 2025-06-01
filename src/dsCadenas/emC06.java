package dsCadenas;

import Utility.colors;

public class emC06 {

    public void emFrase06(String frase) {
        StringBuilder fraseInvertida = new StringBuilder(); // Invertir la frase y convertir vocales a mayúsculas
        for (int i = frase.length() - 1; i >= 0; i--) {
            char letra = frase.charAt(i);
            if ("aeiou".indexOf(Character.toLowerCase(letra)) != -1) {  // Convertir vocales a mayúsculas
                fraseInvertida.append(Character.toUpperCase(letra));
            } else {
                fraseInvertida.append(letra);
            }
        }
        System.out.println(colors.AZUL + "La frase invertida es: "+ colors.RESET+ colors.AMARILLO + fraseInvertida + colors.RESET);
    }

}
