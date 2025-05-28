package dsCadenas;


public class dsCaracter01 {

    public void mostrarCantidadVocales(String frase) {
        int contador = 0;
        String vocales = "aeiouáéíóúAEIOUÁÉÍÓÚ";

        for (char c : frase.toCharArray()) {
            if (vocales.indexOf(c) != -1) {
                contador++;
            }
        }

        System.out.println("Número de vocales: " + contador);
    }
}
