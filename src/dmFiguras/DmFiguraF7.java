package dmFiguras;

public class DmFiguraF7 {
    public void imprimir(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i * 4; j++) {
                System.out.print(" ");
                System.out.print("|___");
            }
        }
    }
}