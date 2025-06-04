package ksSeriesChar;
import Utility.*;

public class ksControllerChar {
    public void showMenuChar()
    {
        int opc = -1;
        int n;

        while (opc != 0) {
            System.out.println(colors.MORADO + "\n--- MENÚ DE SECUENCIAS ---"+ colors.RESET);
            System.out.println("1. Secuencia S1 (+ - + -)");
            System.out.println("2. Secuencia S2 (+ + ++ +++ +++++ ...)");
            System.out.println("3. Secuencia S3 (+++ con cantidad primo)");
            System.out.println("4. Secuencia S4 (+ - * /)");
            System.out.println("5. Secuencia S5 (\\ | / -)");
            System.out.println("6. Secuencia S6 (a b c d...)");
            System.out.println("7. Secuencia S6 segunda forma (a + c - e + ...)");
            System.out.println("8. Secuencia S7 (aa bbbb cccccc ...)");
            System.out.println("9. Secuencia S8 (a bbb ccccc ...)");
            System.out.println("10. Secuencia S9 (a b c dd eee ...)");
            System.out.println("0. Salir");
            System.out.println("Ingrese la opción: ");
            opc = validarIngreso.validarIngresoNumero();

            System.out.println("Ingrese los niveles para la secuencia: ");
            n = validarIngreso.validarIngresoNumero();

            switch (opc) {
                case 1:
                    new ksS1().secuenciaS1(n);
                    break;
                case 2:
                    new ksS2().secuenciaS2(n);
                    break;
                case 3:
                    new ksS3().secuenciaS3(n);
                    break;
                case 4:
                    new ksS4().secuenciaS4(n);
                    break;
                case 5:
                    new ksS5().secuenciaS5(n);
                    break;
                case 6:
                    new ksS6().secuenciaS6(n);
                    break;
                case 7:
                    new ksS6_2().secuenciaS6SegundaForma(n);
                    break;
                case 8:
                   new ksS7().secuenciaS7(n);
                    break;
                
                case 9:
                    new ksS8().secuenciaS8(n);
                    break;
                    case 10:
                    new ksS9().secuenciaS9(n);
                    break;
                case 0:
                    System.out.println("Saliendo al menú principal...");
                    break;
                default: System.out.println("Opción no válida");
                    break;
            }

            if (opc != 0) {
            Esperar.esperarSegundos(3500);//Esperar 3.5 segundos
        }
        }
    }
    }

