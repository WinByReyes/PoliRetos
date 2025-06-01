package dsCadenas;


public class emC07 {

    public void emConvertirSinJ(String frase){
        
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
