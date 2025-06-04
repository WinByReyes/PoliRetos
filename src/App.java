import Utility.*;

public class App {
    public static void main(String[] args) throws Exception {

            int funcion=0;
        
           System.out.println(colors.ROJO+ "¡¡¡Bienvenido a los PoliRetos!!!" + colors.RESET);
           imprimirGrupo nexGenCoders = new imprimirGrupo();
            nexGenCoders.mostrarNombresGrupo();
           do {
               System.out.println(colors.AZUL+ "\nIngrese que sección de los PoliRetos desea probar"+ colors.RESET);
               System.out.println("1. Series Numéricas\n2. Series de Caracteres\n3. Figuras\n4. Cadena de Caracteres");
               System.out.println("5. Arrays\n6. Loading\n7. Recursion\n8. Salir");
               System.out.print("\nNumero de sección a visitar: ");
               funcion= validarIngreso.validarIngresoNumero();
               if (funcion == 9) break;
               seccionMenu.mostrarSeccionMenu(funcion);
           } while(seccionMenu.seguirNavegando());
   
           System.out.println(colors.VERDE + "\n---------------Gracias por visitar nuestro trabajo---------------" + colors.RESET);
       }
       
    }
    



       

