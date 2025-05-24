import Utility.*;

public class App {
    public static void main(String[] args) throws Exception {
        int funcion=0;

        System.out.println("\u001B[1;31m¡¡¡Bienvenido a los PoliRetos!!!\u001B[0m");
        do {
            System.out.println("\nIngrese que sección de los PoliRetos desea probar");
            System.out.println("1. Series Numéricas\n2. Series de Caracteres\n3. Figuras\n4. Cadena de Caracteres");
            System.out.println("5. Arrays\n6. Loading\n7. Recursion\n8. Todo\n9. Salir");
            System.out.print("\nNumero de sección a visitar: ");
            funcion= validarIngreso.validarIngresoNumero();
            if (funcion == 9) break;
            seccionMenu.mostrarSeccionMenu(funcion);
        } while(seccionMenu.seguirNavegando());

        System.out.println("\n---------------Gracias por visitar nuestro trabajo---------------");
    }
    }

