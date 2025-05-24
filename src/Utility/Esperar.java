package Utility;
import java.io.IOException;

public class Esperar {
     /**
     * Pausa la ejecución el número de milisegundos indicado.
     * @param milisegundos tiempo a esperar en ms (1000 ms = 1 segundo)
     */

    public static void esperarSegundos(long milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    /**
     * Este codigo espera que el usuario presione Enter para continuar.
     */
    public static void esperarEnter() {
        System.out.println("Presiona Enter para continuar...");
        try {
            System.in.read();
            while (System.in.available() > 0) {
                System.in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
