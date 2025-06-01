package alSeriesNum;

public class alSeries6 {
    public void imprimir(String color, int n, String reset) {
        for (int cont = 1; cont <= n; cont++) {
            System.out.print(color + cont * cont + reset);
        }
        System.out.println();
    }
}    
