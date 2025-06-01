package dsCadenas;
import Utility.*;

public class controllerCadenas {
    public void showMenuCadenas()
    {
        int opcion = 0;
        String frase =  Lector.leerFrase();

        if (!validarIngreso.esFraseValida(frase)) {
            System.out.println(colors.ROJO+ "Frase inválida o excede límite."+ colors.RESET);
            return;
        }

        while (opcion != 10) {
            System.out.println(colors.CYAN+ "\n--- Menú de Cadenas ---" + colors.RESET);
            System.out.println("1. Contar vocales en frase \n2.Contar letras en frase \n3.Eliminar vocal de frase ");
            System.out.println("4. Eliminar letra de frase \n5.Frase invertida con vocales mayúsculas \n6.Frase invertida con todas mayúsculas ");
            System.out.println("7. Frase mayúsculas sin la letra J \n8.Advininar Anagrama \n9.Convertir letra a mayúscula y otra a minúscula ");
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
