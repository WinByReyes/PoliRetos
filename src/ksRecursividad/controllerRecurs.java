package ksRecursividad;
import Utility.*;
public class controllerRecurs {
    public void showMenuRecurs()
    {
         int opcion =-1;
         while (opcion != 0) {
            System.out.println(colors.MORADO + "\n==== MENÚ DE FUNCIONES RECURSIVAS ====" + colors.RESET);
            System.out.println("1. Factorial");
            System.out.println("2. Suma (a + b)");
            System.out.println("3. Multiplicación (a * b)");
            System.out.println("4. Potencia (a ^ b)");
            System.out.println("5. Conteo Progresivo hasta n");
            System.out.println("6. Conteo Regresivo desde n");
            System.out.println("0. Salir");
            System.out.print(colors.VERDE + "Elige una opción: " + colors.RESET);
            opcion = validarIngreso.validarIngresoNumero();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa n para factorial(n): ");
                    int n = validarIngreso.validarIngresoNumero();
                    System.out.println("Resultado: " + ksR01.calcular(n));
                    break;
                case 2:
                    System.out.print("Ingresa a: ");
                    int a1 = validarIngreso.validarIngresoNumero();
                    System.out.print("Ingresa b: ");
                    int b1 = validarIngreso.validarIngresoNumero();
                    System.out.println("Resultado: " + KSr02.calcular(a1, b1));
                    break;
                case 3:
                    System.out.print("Ingresa a: ");
                    int a2 = validarIngreso.validarIngresoNumero();
                    System.out.print("Ingresa b: ");
                    int b2 = validarIngreso.validarIngresoNumero();
                    System.out.println("Resultado: " + ksR03.calcular(a2, b2));
                    break;
                case 4:
                    System.out.print("Ingresa base a: ");
                    int a3 = validarIngreso.validarIngresoNumero();
                    System.out.print("Ingresa exponente b: ");
                    int b3 = validarIngreso.validarIngresoNumero();
                    System.out.println("Resultado: " + ksR04.calcular(a3, b3));
                    break;
                case 5:
                    System.out.print("Ingresa n para conteo progresivo: ");
                    int n5 = validarIngreso.validarIngresoNumero();
                    System.out.println("Progresivo: " + ksR05.calcular(1, n5, ""));
                    break;
                case 6:
                    System.out.print("Ingresa n para conteo regresivo: ");
                    int n6 = validarIngreso.validarIngresoNumero();
                    System.out.println("Regresivo: " + ksR06.calcular(n6, ""));
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta otra vez.");
            }

         }
         
    }
}
