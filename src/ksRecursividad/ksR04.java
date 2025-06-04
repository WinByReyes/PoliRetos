package ksRecursividad;

import Utility.utilityRecursividad;

public class ksR04 {
     public static int calcular(int a, int b) {
        if (b == 0) return 1;
        return ksR03.calcular(a, calcular(a, utilityRecursividad.decrementar(b)));
    }
}
