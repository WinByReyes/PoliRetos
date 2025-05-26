package esLoading;
import java.util.Scanner;
public class Controller {
        public  void mostrarCarga() {
        // Indicador de carga desde 0 a 100% usando los signos \|/-| para simular un movimiento rotacional de carga 0% hasta 100%
        String[] loadingSymbols = {"|", "/", "-", "\\"};
        int totalSteps = 100;
        for (int i = 0; i <= totalSteps; i++) {
            int symbolIndex = i % loadingSymbols.length;
            String symbol = loadingSymbols[symbolIndex];
            System.out.print("\rCargando " + i + "% " + symbol);
            try {
                Thread.sleep(100); // Simula un tiempo de carga
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restaurar el estado de interrupción
                System.err.println("Carga interrumpida");
            }
        }
    }
        public  char caracterIngresado() {
        // Pedir al usuario que ingrese un símbolo para mostrar en la carga
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un símbolo para mostrar en la carga: ");
        char caracter = scanner.next().charAt(0);
        return caracter; 
     } 
        public  void cargaCaracter() {
        //Mostrar carga con el símbolo ingresado por el usuario en una barra de longuitud 20
        char caracter = caracterIngresado();
        int totalSteps = 20; // Longitud de la barra de carga
        for (int i = 0; i <= totalSteps; i++) {
            StringBuilder barraCarga = new StringBuilder();
            for (int j = 0; j < i; j++) {
                barraCarga.append(caracter);
            }
            System.out.print("\rCargando [" + barraCarga.toString() + "]");
            try {
                Thread.sleep(100); // Simula un tiempo de carga
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restaurar el estado de interrupción
                System.err.println("Carga interrumpida");

        
     }
        
             


}
}
        public char simboloIngresado() {
        // Método para pedir un símbolo al usuario y devolverlo
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un símbolo para mostrar en la carga: ");
        char simbolo = scanner.next().charAt(0);
        return simbolo;
}
        public void cargaSimbolo() {
    // Método: desplazar el símbolo ingresado de izquierda a derecha
    char simbolo = simboloIngresado();
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
        public void cargaSoloPorcentaje() {
    String[] animaciones = {"o0o", "0o0"};
    int totalSteps = 20; // 100% / 5 = 20 pasos

    for (int i = 0; i <= totalSteps; i++) {
        String frame = animaciones[i % 2]; // Alterna entre o0o y 0o0
        int porcentaje = i * 5;
        System.out.print("\r" + frame + " " + porcentaje + "%");

        try {
            Thread.sleep(100); // Simula tiempo de carga
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Carga interrumpida");
        }
    }

    System.out.println(); // Salto de línea final
}

        
 }
       
 
  