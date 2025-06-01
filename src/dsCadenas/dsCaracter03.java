package dsCadenas;
import Utility.*;

public class dsCaracter03 {
    public void eliminarCadena(String frase)
    {
       
        char vocal = Lector.pedirVocal();

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
