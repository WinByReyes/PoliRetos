package dsCadenas;
import Utility.*;

public class dsCaracter03 {
    public void eliminarCadena(String frase)
    {
       
        String vocalStr = Lector.leerPalabra();

        if (vocalStr.isEmpty()) {
            System.out.println("No ingresó vocal.");
            return;
        }

        char vocal = vocalStr.charAt(0);

        String vocales = "aeiouáéíóúAEIOUÁÉÍÓÚ";
        if (vocales.indexOf(vocal) == -1) {
            System.out.println("No ingresó una vocal válida.");
            return;
        }

        StringBuilder resultado = new StringBuilder();
        char vocalMinuscula = Character.toLowerCase(vocal);

        for (char c : frase.toCharArray()) {
            if (Character.toLowerCase(c) != vocalMinuscula) {
                resultado.append(c);
            }
        }

        System.out.println("Frase sin la vocal '" + vocal + "': " + resultado.toString());
      }
}
