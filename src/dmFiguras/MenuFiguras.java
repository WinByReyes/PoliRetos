package dmFiguras;

import java.util.Scanner;

public class MenuFiguras {
    public static void main(String[] args) {
        MenuFiguras menu = new MenuFiguras();
        menu.showMenu();
    }
    
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int figura = 0;
    
        System.out.println("Bienvenido a PoliRetos");
        System.out.println("Este es un programa para imprimir figuras en la consola");
        
        while (figura != 13) {
            System.out.println("\nElige una figura para imprimir:");
            System.out.println("1. Figura 1");
            System.out.println("2. Figura 2");
            System.out.println("3. Figura 3");
            System.out.println("4. Figura 4");
            System.out.println("5. Figura 5");
            System.out.println("6. Figura 6");
            System.out.println("7. Figura 7");
            System.out.println("8. Figura 8");
            System.out.println("9. Figura 9");
            System.out.println("10. Figura 10");
            System.out.println("11. Figura 11");
            System.out.println("12. Figura 12");
            System.out.println("13. Salir");
            System.out.print("Ingrese el número de la figura que desea imprimir: ");
            
            figura = scanner.nextInt();

            int niveles = 0;
            if (figura >= 1 && figura <= 12) {
                System.out.print("Ingrese el número de niveles para la figura " + figura + ": ");
                niveles = scanner.nextInt();
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
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }

        scanner.close();
        System.out.println("Gracias por usar PoliRetos");
    }
}
