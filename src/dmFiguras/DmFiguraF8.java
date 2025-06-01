package dmFiguras;
import Utility.colors;
public class DmFiguraF8 {
    public void imprimir(int n) {
        System.out.println(colors.AZUL);
        for (int i = n - 1; i >= 0; i--) {
            for (int j= 0; j < i * 4; j++) {
                System.out.print(" ");
                System.out.print("___|");
            }
        }
        System.out.println(colors.RESET);
    }
}