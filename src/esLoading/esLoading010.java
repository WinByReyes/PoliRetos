package esLoading;

public class esLoading010 {
    public void figuraRotacion() {
            //Haz que la figura se mueva de izquierda a derecha \|||/  (> <)  ooO-(_)-Ooo 
            String[] figuras = {"\\|||/", "(> <)", "ooO-(_)-Ooo"};
            int totalSteps = 20; // Longitud de la barra de carga
            for (int i = 0; i <= totalSteps; i++) {
                StringBuilder barraCarga = new StringBuilder();
                int figuraIndex = i % figuras.length;
                String figura = figuras[figuraIndex];
                int porcentaje = i * 5; // Calcula el porcentaje de carga (0% a 100%)
                for (int j = 0; j < totalSteps; j++) {
                    if (j < i) {
                        barraCarga.append("="); // Agrega el símbolo "="
                    } else if (j == i) {
                        barraCarga.append(figura); // Agrega la figura rotacional
                    } else {
                        barraCarga.append(" "); // Espacios en las otras posiciones
                    }
                }
                System.out.print("\rCargando [" + barraCarga.toString() + "] " + porcentaje + "%");
                try {
                    Thread.sleep(100); // Simula un tiempo de carga
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // Restaurar el estado de interrupción
                    System.err.println("Carga interrumpida");
                }
            }
                
        }
}
