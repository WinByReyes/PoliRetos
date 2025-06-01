package esLoading;
import Utility.*;
public class Controller {
        public void showMenuLoading()
        {
            int opcion = 0;
            while (opcion != 13) {
                System.out.println(colors.CYAN+ "\n--- Menú de Loading ---"+ colors.RESET);
            System.out.println("1. Spinner rotacional carga \n2.Barra carga fija con caracter \n3.Caracter desplazable en barra ");
            System.out.println("4. Waiting ida y vuelta animado \n5.Barra avance con punta dinámica \n6.Barra desplazable <=> ");
            System.out.println("7. Barra avance con spinner rotacional \n8.Carga letra a letra nombre completo \n9.Mostrar nombre letra por letra animado ");
            System.out.println("10. Figura desplazable ida y vuelta \n11.Escaleras con spinner rotacional \n12.Escaleras con waiting animado ");
            System.out.println("13 Salir");
            System.out.print("Elige una opción: ");
            opcion = validarIngreso.validarIngresoNumero();
            switch (opcion) {
                case 1:
                    new esLoading01().mostrarCarga();
                    break;
                case 2:
                    new esLoading02().cargaCaracter();
                break;
                case 3:
                    new esLoading03().cargaSimbolo();
                break;
                case 4:
                    new esLoading04().cargaSoloPorcentaje();
                break;
                case 5:
                    new esLoading05().cargaBarra();
                break;
                case 6:
                    new esLoading06().flechaMoviendose();
                break;
                case 7:
                    new esLoading07().cargaGiratoria();
                break;
                case 8:
                    new esLoading08().nombreCarga();
                break;
                case 9:
                    new esLoading09().nombreCompleto();
                break;
                case 10:
                    new esLoading010().figuraRotacion();
                break;
                case 11:

                break;
                case 12:

                break;
                case 13:
                     System.out.println("Saliendo al menú principal...");
                break;
                    
                default:System.out.println("Opción no válida");
                    break;
            }
            if (opcion != 13) {
            Esperar.esperarSegundos(3500);//Esperar 3.5 segundos
            }
        }
    }
    } 
 
  