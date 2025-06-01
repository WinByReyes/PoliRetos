package dmFiguras;
import Utility.colors;
public class dsFiguraF13 {
    public void crearFiguraF13(int nivel){
        System.out.println(colors.AZUL);
        for( int i = 1; i <= nivel; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(colors.RESET);
    }
}
