package esLoading;

public class esLoading05 {
    public void cargaBarra() {
            
            String [] loadingSymbols = {"=", ">"};
            int totalSteps = 20; // Longitud de la barra de carga
        
            for (int i = 0; i <= totalSteps; i++) {
                StringBuilder barraCarga = new StringBuilder();
                int porcent= i * 5; // Calcula el porcentaje de carga (0% a 100%)
                for (int j = 0; j < totalSteps; j++) {
                    if (j < i) {
                        barraCarga.append(loadingSymbols[0]); // Agrega el símbolo "="
                    } else if (j == i) {
                        barraCarga.append(loadingSymbols[1]); // Agrega el símbolo ">"
                    } else {
                        barraCarga.append(" "); // Espacios en las otras posiciones
                    }
                }
                System.out.print("\rCargando [" + barraCarga.toString() + "]" + " " + porcent + "%");
                try {
                    Thread.sleep(100); // Simula un tiempo de carga
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // Restaurar el estado de interrupción
                    System.err.println("Carga interrumpida");
                }
            }
            System.out.println(); // Salto de línea final
      }
}
