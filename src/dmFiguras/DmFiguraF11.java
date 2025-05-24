package dmFiguras;

public class DmFiguraF11 {
    public void imprimir(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < (i - 1) * 3; j++) {
                System.out.print(" ");
                System.out.print("|");
                for (int k = 0; k < i; k++) {
                    System.out.print(" _");
                    System.out.println();
                }
            }
        }
    }
}