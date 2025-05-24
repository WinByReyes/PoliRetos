package dmFiguras;

import Utility.validarIngreso;

public class MenuFiguras {
    public void showMenu() {
    int figura = 0;
    System.out.println("Bienvenido a PoliRetos");
    System.out.println("Este es un programa para imprimir figuras en la consola");
    
    while (figura != 20) {
        System.out.println("\nElige una figura para imprimir:");
        for (int i = 1; i <= 19; i++) {
            System.out.println(i + ". Figura " + i);
        }
        System.out.println("20. Salir");
        System.out.print("Ingrese el número de la figura que desea imprimir: ");
        
        figura = validarIngreso.validarIngresoNumero();

        int niveles = 0;
        if (figura >= 1 && figura <= 19) {
            System.out.print("Ingrese el número de niveles para la figura " + figura + ": ");
            niveles = validarIngreso.validarIngresoNumero();
        }
        
        switch (figura) {
            case 1:
                new DmFiguraF1().imprimir(niveles);
                break;
            case 2:
                new DmFiguraF2().imprimir(niveles);
                break;
            case 3:
                new DmFiguraF3().imprimir(niveles);
                break;
            case 4:
                new DmFiguraF4().imprimir(niveles);
                break;
            case 5:
                new DmFiguraF5().imprimir(niveles);
                break;
            case 6:
                new DmFiguraF6().imprimir(niveles);
                break;
            case 7:
                new DmFiguraF7().imprimir(niveles);
                break;
            case 8:
                new DmFiguraF8().imprimir(niveles);
                break;
            case 9:
                new DmFiguraF9().imprimir(niveles);
                break;
            case 10:
                new DmFiguraF10().imprimir(niveles);
                break;
            case 11:
                new DmFiguraF11().imprimir(niveles);
                break;
            case 12:
                new DmFiguraF12().imprimir(niveles);
                break;
            case 13:
                new dsFiguraF13().crearFiguraF13(niveles);
                break;
            case 14:
                    
                break;
            case 15:
                    
                break;
            case 16:
                    
                break;
            case 17:
                    
                break;
            case 18:
                    
                break;
            case 19:
                    
                break;
            case 20:
                System.out.println("Saliendo al menú principal...");
                break;
            default:
                System.out.println("Opción no válida");
        }
        
        if (figura != 20) {
            try {
                Thread.sleep(3500); // pausa 3.5 segundos
            } catch (Exception e) {
                // Ignorar excepción
            }
        }
    }
    
    System.out.println("Gracias por usar PoliRetos");
}
}
