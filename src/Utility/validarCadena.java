package Utility;

public class validarCadena {
    private static final int LIMITE_MAXIMO = 150;

    public static boolean esFraseValida(String frase) {
        if (frase == null || frase.isEmpty()) {
            return false;
        }
        if (frase.length() > LIMITE_MAXIMO) {
            return false;
        }
        String regex = "^[a-zA-ZáéíóúÁÉÍÓÚñÑüÜ ,\\.\\?\\!\\-]*$";
        return frase.matches(regex);
    }
}
