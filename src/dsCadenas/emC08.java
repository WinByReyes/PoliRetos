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
            System.out.println(colors.MORADO+ "Ingrese el anagrama de la palabra: " + palabra + colors.RESET);

            for (int intento = 0; intento < 3; intento++) {
                String respuesta = Lector.pedirPalabraValida();

                if (respuesta.equalsIgnoreCase(anagramaCorrecto)) {
                    System.out.println(colors.VERDE+ "¡Correcto! "+ colors.RESET);
                    acierto = true;
                    break;
                } else if (intento < 2) {
                    System.out.println(colors.ROJO+ "Incorrecto. Te quedan " + (2 - intento) + " intentos." + colors.RESET);
                }
        }

        if(!acierto) {
            System.out.println(colors.AMARILLO+ "Lo siento, la respuesta correcta era: " + anagramaCorrecto + colors.RESET);
        }
        System.out.println(); 
    }

    }
}
