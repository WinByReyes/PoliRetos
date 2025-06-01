package dmFiguras;
import Utility.colors;
public class DmFiguraF2 {
    public void imprimir(int n) {
        System.out.println(colors.AZUL);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1)  {
                    System.out.print((j % 2 == 0 ? "* " : "+ "));
                } else if (j == 0 || j == n - 1) {
                    System.out.print((i % 2 == 0 ? "* " : "+ "));
                } else {
                    System.out.print("  ");
                }
            }       
            System.out.println();
        }
        System.out.println(colors.RESET);
    }
}