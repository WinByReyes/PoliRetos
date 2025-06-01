package esLoading;

public class esLoading01 {
    public  void mostrarCarga() {
        // Indicador de carga desde 0 a 100% usando los signos \|/-| para simular un movimiento rotacional de carga 0% hasta 100%
        String[] loadingSymbols = {"|", "/", "-", "\\"};
        int totalSteps = 100;
        for (int i = 0; i <= totalSteps; i++) {
            int symbolIndex = i % loadingSymbols.length;
            String symbol = loadingSymbols[symbolIndex];
            System.out.print("\rCargando " + i + "% " + symbol);
            try {
                Thread.sleep(100); // Simula un tiempo de carga
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restaurar el estado de interrupción
                System.err.println("Carga interrumpida");
            }
        }
    }
}
