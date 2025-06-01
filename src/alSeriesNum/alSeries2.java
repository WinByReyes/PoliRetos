package alSeriesNum;

public class alSeries2 {
    public void imprimir(String color,int n, String reset) {
        for (int cont = 0; cont < n; cont++) {
            System.out.print(color + cont % 4 * 2 + reset);
        }
        System.out.println();
    }
}    
