package ksSeriesChar;

public class ksS3 {
    public void secuenciaS3(int n) {
        int encontrados = 0;
        int numero = 2;
        while (encontrados < n) {
            if (esPrimo(numero)) {
                for (int i = 0; i < numero; i++) {
                    System.out.print("+");
                }
                System.out.print(" ");
                encontrados++;
            }
            numero++;
        }
        System.out.println();
    }
  // Función auxiliar para verificar si un número es primo
    public static boolean esPrimo(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
