package ksSeriesChar;

public class ksS8 {
    public void secuenciaS8(int n) {
        char letra = 'a';
        int cantidad = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < cantidad; j++) {
                System.out.print(letra);
            }
            System.out.print(" ");
            letra++;
            cantidad += 2;
        }
        System.out.println();
    }

}
