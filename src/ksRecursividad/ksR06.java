package ksRecursividad;
import Utility.utilityRecursividad;
public class ksR06 {
    public static String calcular(int n, String memoria) {
        if (n < 0) return memoria.trim();
        memoria += n + " ";
        return calcular(utilityRecursividad.decrementar(n), memoria);
    }
}
