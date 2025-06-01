package dsCadenas;

import Utility.colors;

public class emC09 {
    
    public void emFrase09(String frase) {
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
        System.out.println(colors.AZUL+ "La frase alternada es: "+ colors.RESET + colors.AMARILLO + fraseAlternada + colors.RESET);
    }
}
