package esLoading;

import Utility.*;

public class esLoading03 {

        public void cargaSimbolo() {
    // Método para pedir un símbolo al usuario y devolverlo
        System.out.print("Ingrese un símbolo para mostrar en la carga: ");
        char simbolo = Lector.sc.next().charAt(0);
    int totalSteps = 20; // Longitud de la barra de carga

    for (int i = 0; i <= totalSteps; i++) {
        StringBuilder barraCarga = new StringBuilder();

        for (int j = 0; j < totalSteps; j++) {
            if (j == i) {
                barraCarga.append(simbolo); // Pone el símbolo solo en la posición actual
            } else {
                barraCarga.append(" "); // Espacios en las otras posiciones
            }
        }

        System.out.print("\rCargando [" + barraCarga.toString() + "] " + (i * 5) + "%");

        try {
            Thread.sleep(100); // Simula tiempo de carga
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Carga interrumpida");
        }
    }

    System.out.println(); // Salto de línea al final
}
}
