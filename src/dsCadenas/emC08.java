package dsCadenas;

import Utility.*;

public class emC08 {


    public void emAnagrama() {
        String[][] anagramas = {
            {"delira", "lidera"},
            {"Ballena", "llenaba"},
            {"Alondra", "Ladrona"},
            {"España", "apañes"},
            {"Enrique", "quieren"},
        };
        for (String[] pair : anagramas){
            String palabra = pair[0];
            String anagramaCorrecto = pair[1];
            boolean acierto = false;
            System.out.println("Ingrese el anagrama de la palabra: " + palabra);

            for (int intento = 0; intento < 3; intento++) {
                String respuesta = Lector.pedirPalabraValida();

                if (respuesta.equalsIgnoreCase(anagramaCorrecto)) {
                    System.out.println("¡Correcto! ");
                    acierto = true;
                    break;
                } else if (intento < 2) {
                    System.out.println("Incorrecto. Te quedan " + (2 - intento) + " intentos.");
                }
        }

        if(!acierto) {
            System.out.println("Lo siento, la respuesta correcta era: " + anagramaCorrecto);
        }
        System.out.println(); 
    }

    }
}
