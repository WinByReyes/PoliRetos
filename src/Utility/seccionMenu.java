package Utility;
import alSeriesNum.ControllerMenuSeries;
import dmFiguras.ControllerMenuFiguras;
import dsCadenas.controllerCadenas;
import emArrays.ControllerArrays;
import esLoading.Controller;
import ksRecursividad.controllerRecurs;
import ksSeriesChar.ksControllerChar;


public class seccionMenu {
    public static void mostrarSeccionMenu(int seccion) throws InterruptedException
{
    switch (seccion) {
            case 1:
            new ControllerMenuSeries().showMenu();
            break;
            case 2:
            new ksControllerChar().showMenuChar();
            break;
            case 3:
            new ControllerMenuFiguras().showMenu();
            break;
            case 4:
            new controllerCadenas().showMenuCadenas();
            break;
            case 5:
            new ControllerArrays().showMenuArrays();
            break;
            case 6:
            new Controller().showMenuLoading();
            break;
            case 7:
            new controllerRecurs().showMenuRecurs();
            break;
            case 8:
            System.out.println("Gracias por usar la aplicacion");
            break;
            
            default:
            System.out.println("Esa seccion no está en las opciones");
            break;
        }
}

public static boolean seguirNavegando (){
        System.out.println(colors.AMARILLO+ "Desea visitar otra seccion? Ingrese Si para continuar y No para cerrar"+ colors.RESET);
        do {
            String continuar=Lector.sc.nextLine().toLowerCase().trim();
            if ("si".equals(continuar)) return true;
            else if ("no".equals(continuar)) return false; 
            else System.out.println(colors.ROJO + "Solo debe ingresar Si o No" + colors.RESET);
        } while (true);
    }
}
