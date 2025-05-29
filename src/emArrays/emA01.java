package emArrays;
import java.util.Scanner;

public class emA01 {

    /**
     * Pide el porcentaje y presenta los nombres con el porcentaje de carga asignado.
     * @param nombres Array de nombres de personas.
     */
    public void emMostrarCargaNombre(){
        String[] emNombres = {"Manuel", "Eduardo", "Sares", "Herrera"};
        int[] emPorcentajes = new int[emNombres.length];

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el porcentaje de carga para cada palabra (separado por espacios): ");
        for(int emI = 0; emI < emNombres.length; emI++) {
            emPorcentajes[emI] = sc.nextInt();
        }

        for (int emI = 0; emI < emNombres.length; emI++) {
            String emBarra = emGenerarBarraCarga(emPorcentajes[emI]);
            int emLetras = (int) Math.round((emNombres[emI].length() * emPorcentajes[emI]) / 100.0);
            String emRecorte = emNombres[emI].substring(0, Math.max(1, emLetras));
            System.out.printf("%s: %3d%% %s\n", emBarra, emPorcentajes[emI], emRecorte);
        }
        
    }

    private String emGenerarBarraCarga(int porcentaje) {
        int emTotal = 15;
        int emLlenos = (int) Math.round((porcentaje / 100.0) * emTotal);
        StringBuilder emBarra = new StringBuilder("[");
        for (int emI = 0; emI < emLlenos; emI++) emBarra.append("=");
            emBarra.append(">");
        for (int emI = emLlenos + 1; emI < emTotal; emI++) emBarra.append(" ");
            emBarra.append("]");
        return emBarra.toString();
    }
}
