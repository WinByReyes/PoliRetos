package ksSeriesChar;

public class ksS4 {
     public void secuenciaS4(int n) {
        char[] signos = {'+', '-', '*', '/'};
        for (int i = 0; i < n; i++) {
            System.out.print(signos[i % 4] + " ");
        }
        System.out.println();
    }

}
