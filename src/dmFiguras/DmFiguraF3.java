package dmFiguras;

public class DmFiguraF3 {
    public void imprimir(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}