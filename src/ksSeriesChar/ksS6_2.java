package ksSeriesChar;

public class ksS6_2 {
    public void secuenciaS6SegundaForma(int n) {
        for (int i = 0; i < n; i++) {
            char letra = (char) ('a' + i * 2);  // salta de dos en dos
            if (i % 2 == 0)
                System.out.print(letra + " + ");
            else
                System.out.print(letra + " - ");
        }
        System.out.println();
    }

}
