package alSeriesNum;

import Utility.*;

public class ControllerMenuSeries {
    public void showMenu() {
    int numero = 0;
    System.out.println("Bienvenido a PoliRetos");
    System.out.println("Este es un programa para imprimir series numericas en la consola");
    
    while (numero != 12) {
        System.out.println("\nElige una serie para imprimir:");
        for (int i = 1; i <= 11; i++) {
            System.out.println(i + ". Serie numerica " + i);
        }
        System.out.println("12. Salir");
        System.out.print("Ingrese el número de la serie numerica que desea imprimir: ");
        
        numero = validarIngreso.validarIngresoNumero();

        int posicion = 0;
        if (numero >= 1 && numero <= 12) {
            System.out.print("Ingrese el número de niveles para la el tamano de la serie " + posicion + ": ");
            posicion = validarIngreso.validarIngresoNumero();
        }
        
        switch (numero) {
            case 1 -> new alSeries1().imprimir(posicion);
            case 2 -> new alSeries2().imprimir(posicion);
            case 3 -> new alSeries3().imprimir(posicion);
            case 4 -> new alSeries4().imprimir(posicion);
            case 5 -> new alSeries5().imprimir(posicion);
            case 6 -> new alSeries6().imprimir(posicion);
            case 7 -> new alSeries7().imprimir(posicion);
            case 8 -> new alSeries8().imprimir(posicion);
            case 9 -> new alSeries9().imprimir(posicion);
            case 10 -> new alSeries10().imprimir(posicion);
            case 11 -> new alSeries11().imprimir(posicion);
            case 12 -> System.out.println("Saliendo al menú principal...");
            default -> System.out.println("Opción no válida");
        }
        
        if (numero != 12) {
            Esperar.esperarSegundos(3500);//Esperar 3.5 segundos
        }
    }
    
    System.out.println("Gracias por usar PoliRetos");
}
}
