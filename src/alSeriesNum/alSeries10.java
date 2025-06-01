package alSeriesNum;

public class alSeries10 {
    public void imprimir(String colo, int n, String reset) {
        int val = 3;
        for (int i = 0; i < n; i++) {
            System.out.print(colo+ val + reset);
            val *= 3;
        }
        System.out.println();
    }
}    
