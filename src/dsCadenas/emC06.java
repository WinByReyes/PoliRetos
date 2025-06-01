package dsCadenas;

public class emC06 {

    public void emFrase06(String frase) {
       
        StringBuilder fraseInvertida = new StringBuilder(); // Invertir la frase y convertir vocales a mayúsculas
        for (int i = frase.length() - 1; i >= 0; i--) {
            char letra = frase.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {  // Convertir vocales a mayúsculas
                fraseInvertida.append(letra);
            } else {
                fraseInvertida.append(Character.toUpperCase(letra));
            }
        }
        System.out.println("La frase invertida es: " + fraseInvertida);
    }

}
