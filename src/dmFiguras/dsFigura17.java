package dmFiguras;
import Utility.colors;
public class dsFigura17 {
    public void mostrarFigura17(int nivel)
    {
        System.out.println(colors.AZUL);
         for (int i = 0; i < nivel; i++) {
            for (int j = 0; j < nivel; j++) {
                if (i == j || i + j == nivel - 1) {
                    if (i % 2 == 0) System.out.print("1");
                    else System.out.print("0");
                } else System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(colors.RESET);
    }
}
