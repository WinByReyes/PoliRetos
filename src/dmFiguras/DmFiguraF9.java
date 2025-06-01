package dmFiguras;
import Utility.colors;
public class DmFiguraF9 {
    public void imprimir(int n) {
        System.out.println(colors.AZUL);
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < i * 4; j++) {
                System.out.print(" ");
                System.out.println("___| |___");
            }
        }
        System.out.println(colors.RESET);
    }
}