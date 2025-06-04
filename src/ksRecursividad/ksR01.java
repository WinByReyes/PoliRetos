package ksRecursividad;

import Utility.utilityRecursividad;

public class ksR01 {
 public static int calcular(int n) {
        if (n == 0) return 1;
        return ksR03.calcular(n, calcular(utilityRecursividad.decrementar(n)));
    }
}
