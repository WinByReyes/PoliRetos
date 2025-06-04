package ksSeriesChar;

public class ksS2 {
    public static void secuenciaS2(int n) {
    int a = 1, b = 1;

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < a; j++) {
            System.out.print("+");
        }
        System.out.print(" ");
        int temp = a + b;
        a = b;
        b = temp;
    }
}

}
