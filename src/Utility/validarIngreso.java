package Utility;

public class validarIngreso {
    
  //Validar numeros
    public static int validarIngresoNumero() {
    int num=-1;
    boolean aceptacion=false;
    while (!aceptacion) {
      try {
        num = Integer.parseInt(Lector.sc.nextLine());
        if (num>0){
          aceptacion=true;
        } else {
          System.out.println("Ingrese un numero mayor a 0");
        }
      } catch (NumberFormatException e) {
        System.out.println("Entrada inválida. Por favor, ingrese un número entero positivo:");
      }
    }
    return num;
  }

  public static int validarIngresoNumeroPosNeg() {
    int num=-1;
    boolean aceptacion=false;
    while (!aceptacion) {
      try {
        num = Integer.parseInt(Lector.sc.nextLine());
        aceptacion=true;
      } catch (NumberFormatException e) {
        System.out.println("Entrada inválida. Por favor, ingrese un número entero:");
      }
    }
    return num;
  }
//Validar texto
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
