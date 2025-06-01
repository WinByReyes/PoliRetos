package dsCadenas;

import Utility.colors;

public class dsCaracter02 {
    public void mostrarCantidadLetras(String frase) {
        int contador = 0;
        for (char c : frase.toCharArray()) {
            if (Character.isLetter(c)) {
                contador++;
            }
        }

        System.out.println(colors.AZUL + "Número de letras: " + contador + colors.RESET);
    }
}
