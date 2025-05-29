package dsCadenas;
import Utility.*;

public class controllerCadenas {
    public void showMenuCadenas()
    {
        int opcion = 0;
        String frase =  Lector.leerFrase();

        if (!validarCadena.esFraseValida(frase)) {
            System.out.println("Frase inválida o excede límite.");
            return;
        }

        while (opcion != 10) {
            System.out.println("\n--- Menú de Cadenas ---");
            System.out.println("1. Mostrar vocales \n2.Mostrar letras \n3.Eliminar vocal ");
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
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    
                    break;
                case 8:
                    
                    break;
                
                case 9:
                    
                    break;
                case 10:
                    
                    break;
                default:
                    break;
            }

            if (opcion != 10) {
            Esperar.esperarSegundos(3500);//Esperar 3.5 segundos
        }
        }
    }
}
