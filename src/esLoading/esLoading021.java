package esLoading;

public class esLoading021 {
    public void escaleraWaiting() {
        String waiting = "o0o 100%";
        int lineas = 5;
        for (int i = lineas - 1; i >= 0; i--) {
            // Imprime espacios para sangría decreciente
            for (int j = 0; j < i; j++) {
                System.out.print("    "); // 4 espacios
            }
            // Imprime la estructura que va hacia la izquierda
            System.out.print("___|");
            // Añade espacios para que el "o0o 100%" quede alineado
            int espacios = (lineas - 1 - i) * 4;
            for (int k = 0; k < espacios; k++) {
                System.out.print(" ");
            }
            System.out.println(waiting);
        }
        // Línea final con "|"
        for (int j = 0; j < lineas; j++) {
            System.out.print("    ");
        }
        System.out.println("|                       " + waiting);
    }
}
