package dmFiguras;

public class DmFiguraF8 {
    public void imprimir(int n) {
        for (int i = n - 1; i >= 0; i--) {
            for (int j= 0; j < i * 4; j++) {
                System.out.print(" ");
                System.out.print("___|");
            }
        }
    }
}