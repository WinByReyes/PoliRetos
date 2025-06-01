package dmFiguras;
import Utility.colors;
public class DmFiguraF7 {
    public void imprimir(int n) {
        System.out.println(colors.AZUL);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i * 4; j++) {
                System.out.print(" ");
                System.out.print("|___");
            }
        }
        System.out.println(colors.RESET);
    }
}