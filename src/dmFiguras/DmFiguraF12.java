package dmFiguras;
import Utility.colors;
public class DmFiguraF12 {
    public void imprimir(int n) {
        System.out.println(colors.AZUL);
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j ++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println(colors.RESET);
    }
}