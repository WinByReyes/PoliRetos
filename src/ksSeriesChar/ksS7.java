package ksSeriesChar;

public class ksS7 {
    public void secuenciaS7(int n) {
        char letra = 'a';
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i * 2; j++) {
                System.out.print(letra);
            }
            System.out.print(" ");
            letra++;
        }
        System.out.println();
    }

}
