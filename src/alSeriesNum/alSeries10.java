package alSeriesNum;

public class alSeries10 {
    public void imprimir(int n) {
        int val = 3;
        for (int i = 0; i < n; i++) {
            System.out.print(val + " ");
            val *= 3;
        }
        System.out.println();
    }
}    
