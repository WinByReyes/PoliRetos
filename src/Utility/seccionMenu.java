package Utility;
import alSeriesNum.ControllerMenuSeries;
import dmFiguras.ControllerMenuFiguras;
import dsCadenas.controllerCadenas;
import emArrays.ControllerArrays;
import esLoading.Controller;


public class seccionMenu {
    public static void mostrarSeccionMenu(int seccion) throws InterruptedException
{
    switch (seccion) {
            case 1:
            new ControllerMenuSeries().showMenu();
            break;
            case 2:
            //Caracteres
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
            //Loading
            break;
            case 8:
            //Todo
            new ControllerMenuFiguras().showMenu();
            break;
            
            default:
            System.out.println("Esa seccion no está en las opciones");
            break;
        }
}

public static boolean seguirNavegando (){
        System.out.println("Desea visitar otra seccion? Ingrese Si para continuar y No para cerrar");
        do {
            String continuar=Lector.sc.nextLine().toLowerCase().trim();
            if ("si".equals(continuar)) return true;
            else if ("no".equals(continuar)) return false; 
            else System.out.println("\u001B[31mSolo debe ingresar Si o No \u001B[0m");
        } while (true);
    }
}
