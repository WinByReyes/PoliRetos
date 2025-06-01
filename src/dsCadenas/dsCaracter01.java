package dsCadenas;

import Utility.colors;

public class dsCaracter01 {

    public void mostrarCantidadVocales(String frase) {
        int contador = 0;
        
        String vocales = "aeiouáéíóúAEIOUÁÉÍÓÚ";

        for (char c : frase.toCharArray()) {
            if (vocales.indexOf(c) != -1) {
                contador++;
            }
        }

        System.out.println(colors.AZUL+ "Número de vocales: " + contador+ colors.RESET);
        
    }
}
