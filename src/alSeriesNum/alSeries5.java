package alSeriesNum;

public class alSeries5 {
    public void imprimir(String color, int n,String reset) {
        int cont = 0, num = 2;
         while (cont < n) {
            if (numeroPrimo(num)) {
                System.out.print(color+ num + reset);
                cont++;
            }
            num++;
        }
        System.out.println();
    }

     public static boolean numeroPrimo(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }

        return true;
    }
} 


