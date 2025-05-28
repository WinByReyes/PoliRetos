package dmFiguras;

public class dsFigura18 {
    
    public void mostrarFigura18(int nivel)
    {
        int[][] triangulo = new int[nivel][nivel];
        for (int i = 0; i < nivel; i++) {
            triangulo[i][0] = 1;
            triangulo[i][i] = 2;
            for (int j = 1; j < i; j++) {
                triangulo[i][j] = triangulo[i - 1][j - 1] + triangulo[i - 1][j];
            }
            for (int j = 0; j <= i; j++) {
                if(triangulo[i][j] < 10) System.out.print(" "+triangulo[i][j] + " ");
                else System.out.print(triangulo[i][j] + " ");
            }
            System.out.println();
        }    
        System.out.println();
    }
}
