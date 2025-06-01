package esLoading;

public class esLoading04 {
    public void cargaSoloPorcentaje() {
        String[] animaciones = {"o0o", "0o0"};
        int totalSteps = 20; // 100% / 5 = 20 pasos

        for (int i = 0; i <= totalSteps; i++) {
            String frame = animaciones[i % 2]; // Alterna entre o0o y 0o0
            int porcentaje = i * 5;
            System.out.print("\r" + frame + " " + porcentaje + "%");

            try {
                Thread.sleep(100); // Simula tiempo de carga
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Carga interrumpida");
            }
        }

        System.out.println(); // Salto de línea final
    }
}
