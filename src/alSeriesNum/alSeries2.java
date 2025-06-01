package alSeriesNum;

public class alSeries2 {
    public void imprimir(int n) {
        for (int cont = 0; cont < n; cont++) {
            System.out.print(cont % 4 * 2 + " ");
        }
        System.out.println();
    }
}    
