package esLoading;

public class esLoading06 {
    public void flechaMoviendose(){
            //Metodo de una barra de 20 caracteres, la barra <=> debe moverse de izquierda a derecha
            String barra = "<=>";
            int totalSteps = 20; // Longitud de la barra de carga
            for (int i = 0; i <= totalSteps; i++) {
                StringBuilder barraCarga = new StringBuilder();
                for (int j = 0; j < totalSteps; j++) {
                    if (j == i) {
                        barraCarga.append(barra); // Pone la flecha solo en la posición actual
                    } else {
                        barraCarga.append(" "); // Espacios en las otras posiciones
                    }
                }
                System.out.print("\rCargando [" + barraCarga.toString() + "] " + (i * 5) + "%");
                try {
                    Thread.sleep(100); // Simula tiempo de carga
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.err.println("Carga interrumpida");
                }
            }
}
}

