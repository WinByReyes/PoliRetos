package dmFiguras;

public class dsFigura14 {
    private int[][] piramide;

    public void generarFiguraF14(int nivel)
    {
        piramide = new int[nivel][nivel];

        for(int i =0; i< nivel; i++)
        {
            piramide[i][0]= 1;
            piramide[i][i]= 1;

            for(int j = 1; j < i; j++ )
            {
                piramide[i][j] = piramide[i-1][j-1] + piramide[i-1][j];
            }
        }

        for (int i = 0; i < nivel; i++) {
            for (int j = 0; j < nivel - i; j++) {
                System.out.print("   ");
            }
            
            for (int j = 0; j <= i; j++) {
                System.out.printf("%6d", piramide[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
