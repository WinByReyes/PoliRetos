package ksSeriesChar;

public class ksS9 {
    public void secuenciaS9(int n) {
        char letra = 'a';
        int a = 1, b = 1, c = 1;

        for (int i = 0; i < n; i++) {
            int cantidad;
            if (i < 3) {
                cantidad = 1;
            } else {
                cantidad = a + b;
                a = b;
                b = c;
                c = cantidad;
            }

            for (int j = 0; j < cantidad; j++) {
                System.out.print(letra);
            }
            System.out.print(" ");
            letra++;
        }
        System.out.println();
    }

}
