package dmFiguras;
import Utility.colors;
public class DmFiguraF10 {
    public void imprimir(int n) {
        System.out.println(colors.AZUL);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i * 4; j++) {
                System.out.print(" ");
                System.out.println((i % 2 == 0 ? "|_-_" : "|_+_"));
            }
        }
        System.out.println(colors.RESET);
    }
}