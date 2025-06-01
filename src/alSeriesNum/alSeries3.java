package alSeriesNum;

public class alSeries3 {
    public void imprimir(String color, int n, String reset) {
        int numNumUno = 0, numNumDos = 1, denominador = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(color + numNumUno + "/" + denominador + reset);
            int temp = numNumUno + numNumDos ;
            numNumUno = numNumDos;
            numNumDos = temp; 
            denominador += 2;
        }
        System.out.println();
    }
}  
