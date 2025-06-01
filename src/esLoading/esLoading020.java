package esLoading;

public class esLoading020 {
    public void escaleraSpinner() {
        String spiner = "/ 100%";
        int lineas = 5;
        for (int i = 0; i < lineas; i++) {
            // Imprime espacios para formar la escalera
            for (int j = 0; j < i; j++) {
                System.out.print("    "); // 4 espacios para sangría
            }
            // Imprime la estructura
            System.out.print("|___    " + spiner);
            System.out.println();
        }
    }
}
