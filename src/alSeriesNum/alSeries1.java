package alSeriesNum;

public class alSeries1 {
    public void imprimir(int n) {
        int numUno = 0, numDos = 1;
        for (int cont = 0; cont < n; cont++) {
            System.out.println(numUno + " ");
            int temp = numUno + numDos ;
            numUno = numDos;
            numDos = temp;
        }      
    }
}    