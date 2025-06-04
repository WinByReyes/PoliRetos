package ksSeriesChar;

public class ksS5 {
    public void secuenciaS5(int n) {
        char[] simbolos = {'\\', '|', '/', '-', '|'};
        for (int i = 0; i < n; i++) {
            System.out.print(simbolos[i % simbolos.length] + " ");
        }
        System.out.println();
    }

}
