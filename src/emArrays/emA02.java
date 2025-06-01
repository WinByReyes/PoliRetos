package emArrays;
import Utility.*;

public class emA02 {

    /**
     * Solicita el tamano de una matriz y caracter, almacena las iniciales de su nombre y apellido y presenta las letras
     */
    public void emMostrarInicialMatriz() {

        System.out.println("Inngresar tu nombre y apellido.");
        String nombreCompleto = Lector.sc.nextLine();
        
        //Separar nombre y apellido y obtener iniciales
        String[] partes = nombreCompleto.trim().split("\\s+");
        if(partes.length < 2){
            System.out.println("Debes ingresar al menos y apellido.");
            return;
        }
        char inicial1 = Character.toUpperCase(partes[0].charAt(0));
        char inicial2 = Character.toUpperCase(partes[1].charAt(0));

        //Pedir tamano y caracter
        System.out.print("Ingrese el tamano de la matriz: ");
        int tamano = validarIngreso.validarIngresoNumero();
        System.out.print("Ingrese el caracter para dibujar: ");
        char caracter = Lector.pedirLetra();

        char[][] matriz = new char[tamano][tamano * 2 + 1];

        //Llenar la matriz con espacios en blanco
        for (int i = 0; i < tamano; i++){
            for (int j = 0; j < tamano * 2 + 1; j++){
                matriz[i][j] = ' ';
            }
        }

        //Dibujar las iniciales usando el caracter ingresado
        dibujarLetra(matriz, inicial1, 0, tamano, caracter);
        //Segunda letra
        dibujarLetra(matriz, inicial2, tamano + 1, tamano, caracter);

        //Mostrar la matriz
        System.out.println("\nMatriz con iniciales " + inicial1 + inicial2 + ": ");
        for(int i = 0; i < tamano; i++){
            for (int j = 0; j < tamano * 2 + 1; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
    
    private void dibujarLetra(char[][] matriz, char letra, int offset, int tamano, char caracter){
        for(int i=0; i<tamano; i++){
            for(int j=0; j<tamano; j++){
                switch(letra){
                    case 'A':
                        if(j == 0 || j == tamano - 1 || i == 0 || i == tamano/2){
                            matriz[i][j + offset] = caracter;
                        }
                        break;
                    case 'B':
                        if(j == 0 || i == 0 || i == tamano-1 || i == tamano/2 ||
                           (j == tamano-1 && i != 0 && i != tamano/2 && i != tamano-1)) {
                            matriz[i][j + offset] = caracter;
                        }
                        break;
                    case 'C':
                        if(j == 0 || i == 0 || i == tamano-1) {
                            matriz[i][j + offset] = caracter;
                        }
                        break;
                    case 'D':
                        if(j == 0 || (j == tamano-1 && i != 0 && i != tamano-1) || 
                           i == 0 || i == tamano-1) {
                            matriz[i][j + offset] = caracter;
                        }
                        break;
                    case 'E':
                        if(j == 0 || i == 0 || i == tamano/2 || i == tamano-1) {
                            matriz[i][j + offset] = caracter;
                        }
                        break;
                    case 'F':
                        if(j == 0 || i == 0 || i == tamano/2) {
                            matriz[i][j + offset] = caracter;
                        }
                        break;
                    case 'G':
                        if(j == 0 || i == 0 || i == tamano-1 || 
                           (j == tamano-1 && i >= tamano/2) ||
                           (i == tamano/2 && j >= tamano/2)) {
                            matriz[i][j + offset] = caracter;
                        }
                        break;
                    case 'H':
                        if(j == 0 || j == tamano-1 || i == tamano/2) {
                            matriz[i][j + offset] = caracter;
                        }
                        break;
                    case 'I':
                        if(i == 0 || i == tamano-1 || j == tamano/2) {
                            matriz[i][j + offset] = caracter;
                        }
                        break;
                    case 'J':
                        if(i == 0 || (j == tamano/2 && i < tamano-1) ||
                           (i == tamano-1 && j < tamano/2)) {
                            matriz[i][j + offset] = caracter;
                        }
                        break;
                    case 'K':
                        if(j == 0 || (Math.abs(j - i) == tamano/2) ||
                           (i + j == tamano-1 && i >= tamano/2)) {
                            matriz[i][j + offset] = caracter;
                        }
                        break;
                    case 'L':
                        if(j == 0 || i == tamano-1) {
                            matriz[i][j + offset] = caracter;
                        }
                        break;
                    case 'M':
                        if(j == 0 || j == tamano-1 || 
                           (i == j && i <= tamano/2) ||
                           (i + j == tamano-1 && i <= tamano/2)) {
                            matriz[i][j + offset] = caracter;
                        }
                        break;
                    case 'N':
                        if(j == 0 || j == tamano-1 || i == j) {
                            matriz[i][j + offset] = caracter;
                        }
                        break;
                    case 'O':
                        if((j == 0 && i != 0 && i != tamano-1) ||
                           (j == tamano-1 && i != 0 && i != tamano-1) ||
                           (i == 0 && j != 0 && j != tamano-1) ||
                           (i == tamano-1 && j != 0 && j != tamano-1)) {
                            matriz[i][j + offset] = caracter;
                        }
                        break;
                    case 'P':
                        if(j == 0 || i == 0 || i == tamano/2 ||
                           (j == tamano-1 && i < tamano/2)) {
                            matriz[i][j + offset] = caracter;
                        }
                        break;
                    case 'Q':
                        if((j == 0 && i < tamano-2) ||
                           (j == tamano-1 && i < tamano-2) ||
                           (i == 0 && j < tamano-1) ||
                           (i == tamano-2 && j < tamano-1) ||
                           (i == j && i >= tamano/2)) {
                            matriz[i][j + offset] = caracter;
                        }
                        break;
                    case 'R':
                        if(j == 0 || i == 0 || i == tamano/2 ||
                           (j == tamano-1 && i < tamano/2) ||
                           (i-j == tamano/2)) {
                            matriz[i][j + offset] = caracter;
                        }
                        break;
                    case 'S':
                        if(i == 0 || i == tamano/2 || i == tamano-1 ||
                           (j == 0 && i < tamano/2) ||
                           (j == tamano-1 && i > tamano/2)) {
                            matriz[i][j + offset] = caracter;
                        }
                        break;
                    case 'T':
                        if(i == 0 || j == tamano/2) {
                            matriz[i][j + offset] = caracter;
                        }
                        break;
                    case 'U':
                        if((j == 0 && i != tamano-1) ||
                           (j == tamano-1 && i != tamano-1) ||
                           (i == tamano-1 && j != 0 && j != tamano-1)) {
                            matriz[i][j + offset] = caracter;
                        }
                        break;
                    case 'V':
                        if((j == i/2) || (j + i/2 == tamano-1)) {
                            matriz[i][j + offset] = caracter;
                        }
                        break;
                    case 'W':
                        if(j == 0 || j == tamano-1 ||
                           (i == j+tamano/2 && i >= tamano/2) ||
                           (i+j == tamano-1+tamano/2 && i >= tamano/2)) {
                            matriz[i][j + offset] = caracter;
                        }
                        break;
                    case 'X':
                        if(i == j || i + j == tamano-1) {
                            matriz[i][j + offset] = caracter;
                        }
                        break;
                    case 'Y':
                        if((i == j && i <= tamano/2) ||
                           (i + j == tamano-1 && i <= tamano/2) ||
                           (j == tamano/2 && i >= tamano/2)) {
                            matriz[i][j + offset] = caracter;
                        }
                        break;
                    case 'Z':
                        if(i == 0 || i == tamano-1 || i + j == tamano-1) {
                            matriz[i][j + offset] = caracter;
                        }
                        break;
                }
            }
        }
    }
    
}
