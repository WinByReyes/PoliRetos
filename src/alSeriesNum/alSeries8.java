package alSeriesNum;

public class alSeries8 {
    public void imprimir(String color, int n, String reset) {
        int val = 3;
        for (int i = 0; i < n; i++) {
            System.out.print(color+ val + reset);
            val += 5;
        }
    }
}    
