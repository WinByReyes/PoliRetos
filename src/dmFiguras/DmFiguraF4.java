package dmFiguras;
import Utility.colors;
public class DmFiguraF4 {
    public void imprimir(int n) {
        System.out.println(colors.AZUL);
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println(colors.RESET);
    }
}