package dmFiguras;
import Utility.colors;
public class dsFigura16 {
    
    public  void mostrarFigura16(int nivel)
    {
        System.out.println(colors.AZUL);
        for (int i = 0; i < nivel; i++) {
            for (int c = 0; c < nivel; c++) {
                if (i == c || i + c == nivel - 1) {
                    if (i % 2 == 0) System.out.print("+");
                    else System.out.print("-");
                } else System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(colors.RESET);
    }
}
