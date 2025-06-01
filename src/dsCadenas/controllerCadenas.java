package dsCadenas;
import Utility.*;

public class controllerCadenas {
    public void showMenuCadenas()
    {
        int opcion = 0;
        String frase =  Lector.leerFrase();

        if (!validarIngreso.esFraseValida(frase)) {
            System.out.println("Frase inválida o excede límite.");
            return;
        }

        while (opcion != 10) {
            System.out.println("\n--- Menú de Cadenas ---");
            System.out.println("1. Mostrar vocales \n2.Mostrar letras \n3.Eliminar vocal ");
            System.out.println("4. Eliminar letra \n5.Invertir la frase \n6.Invertir la frase (Mayusculas) ");
            System.out.println("7. Mostrar sin la J \n8.Advininar Anagrama \n9.Eliminar vocal ");
            System.out.println("10 Salir");
            System.out.print("Elige una opción: ");
            opcion = validarIngreso.validarIngresoNumero();
            switch (opcion) {
                case 1:
                    new dsCaracter01().mostrarCantidadVocales(frase);
                    break;
                case 2:
                    new dsCaracter02().mostrarCantidadLetras(frase);
                    break;
                case 3:
                    new dsCaracter03().eliminarCadena(frase);;
                    break;
                case 4:
                    new emC04().emFrase04(frase);
                    break;
                case 5:
                    new emC05().emFrase05(frase);
                    break;
                case 6:
                    new emC06().emFrase06(frase);
                    break;
                case 7:
                    new emC07().emConvertirSinJ(frase);
                    break;
                case 8:
                    new emC08().emAnagrama();
                    break;
                
                case 9:
                    new emC09().emFrase09(frase);
                    break;
                case 10:
                    System.out.println("Saliendo al menú principal...");
                    break;
                default: System.out.println("Opción no válida");
                    break;
            }

            if (opcion != 10) {
            Esperar.esperarSegundos(3500);//Esperar 3.5 segundos
        }
        }
    }
}
