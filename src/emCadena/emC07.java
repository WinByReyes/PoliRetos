package emCadena;
import java.util.Scanner;

public class emC07 {

    /**
     * Pide una frase y la presenta convertida sin la letra 'j'.
     */
    public void emConvertirSinJ(){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();
        
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < frase.length(); i++) {
            char letra = Character.toUpperCase(frase.charAt(i));
            if (letra != 'j' && letra != 'J') { // Excluir la letra 'j' y 'J'
                resultado.append(letra);
            }
        }
        System.out.println("La frase convertida sin J es: " + resultado);
    }

}
