package alSeriesNum;

public class alSeries1 {
    public void imprimir(String color,int n, String reset) {
        int numUno = 0, numDos = 1;
        for (int cont = 0; cont < n; cont++) {
            System.out.println(color + numUno + reset);
            int temp = numUno + numDos ;
            numUno = numDos;
            numDos = temp;
        }      
    }
}    