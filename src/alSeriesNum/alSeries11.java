package alSeriesNum;

public class alSeries11 {
    public void imprimir(String colo,int n, String reset) {
        for (int i = 1; i <= n; i++) {
            System.out.print(colo + i * (i + 1) + reset);
        }
        System.out.println();
    }
}    
