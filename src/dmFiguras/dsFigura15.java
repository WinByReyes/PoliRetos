package dmFiguras;
import Utility.colors;
public class dsFigura15 {
    public void mostrarFigura15(int nivel)
    {
        System.out.println(colors.AZUL);
        int [][] piramide = new int[nivel][nivel];

        for(int i = 0; i < nivel; i++)
        {
            piramide [i][0] = 1;
            piramide [i][i] = 1;
            for(int j = 1; j < i; j++)
            {
                piramide[i][j] = piramide[i-1][j-1]+ piramide[i-1][j];
            }

            for(int j = 0; j<= i; j++)
            {
                if(piramide[i][j] < 10)
                {
                    System.out.print(" " + piramide[i][j] + " ");
                }
                else System.out.print(piramide[i][j] + " ");
                
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(colors.RESET);
    }
}
