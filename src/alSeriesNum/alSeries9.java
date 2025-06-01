package alSeriesNum;

public class alSeries9 {
    public void imprimir(String colo,int n,String reset) {
        int val = 2;
        for (int i = 0; i < n; i++) {
            System.out.print(colo+ val + reset);
            val *= 2;
        }
        System.out.println();
    }
}    
