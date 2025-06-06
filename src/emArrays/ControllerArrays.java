package emArrays;
import Utility.*;
public class ControllerArrays {

    public void showMenuArrays()
    {
        int opcion = 0;

        while(opcion != 6)
        {
            System.out.println(colors.CYAN+ "\n--- Menú de Arrays ---"+ colors.RESET);
            System.out.println("1.Barras de carga por palabra \n2.Matriz iniciales con carácter \n3.Plano coordenadas con nombre ");
            System.out.println("4. Matriz en X con nombre y apellido\n5.Matriz aleatoria con letras y asteriscos \n6.Salir ");
            System.out.print("Elige una opción: ");
            opcion = validarIngreso.validarIngresoNumero();

            switch (opcion) {
                case 1:
                    new emA01().emMostrarCargaNombre();
                    break;
                
                case 2:
                    new emA02().emMostrarInicialMatriz();
                    break;
                case 3:
                    new emA03().emMostrarNombrePlano();
                    break;
                case 4:
                    new emA04().emMostrarNombreCruz();
                    break;
                case 5:
                    new emA05().emMatrizNomCuadrada();
                    break;
                case 6:
                    System.out.println("Saliendo al menú principal...");
                    break;
                default: System.out.println("Opción no válida");
                    break;
            }

            if (opcion != 6) {
            Esperar.esperarSegundos(3500);//Esperar 3.5 segundos
            }
        }
    }
}
