package esLoading;

public class esLoading07 {
    public void cargaGiratoria() {
            //crear una barra de 20 caracteres, la barra avanza cambiando la punta con movimiento rotacional signos;  \|/-| 
            String[] loadingSymbols = {"|", "/", "-","\\"};
            int totalSteps = 20; // Longitud de la barra de carga
            for (int i = 0; i <= totalSteps; i++) {
                StringBuilder barraCarga = new StringBuilder();
                int symbolIndex = i % loadingSymbols.length;
                String symbol = loadingSymbols[symbolIndex];
                int porcentaje1 = i * 5; // Calcula el porcentaje de carga (0% a 100%)
                for (int j = 0; j < totalSteps; j++) {
                    if (j < i) {
                        barraCarga.append("="); // Agrega el símbolo "="
                    } else if (j == i) {
                        barraCarga.append(symbol); // Agrega el símbolo de carga rotacional
                    } else {
                        barraCarga.append(" "); // Espacios en las otras posiciones
                    }
                }
                System.out.print("\rCargando [" + barraCarga.toString() + porcentaje1 + "%]");
                try {
                    Thread.sleep(100); // Simula un tiempo de carga
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // Restaurar el estado de interrupción
                    System.err.println("Carga interrumpida");
                }
            }
     }
}
