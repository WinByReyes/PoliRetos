package dmFiguras;

import java.util.Scanner;

public class ControllerF1toF12 {

    public void showFiguras() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de niveles para las Figuras: ");
        int niveles = scanner.nextInt();

        new DmFiguraF1().imprimir(niveles);
        new DmFiguraF2().imprimir(niveles);
        new DmFiguraF3().imprimir(niveles);
        new DmFiguraF4().imprimir(niveles);
        new DmFiguraF5().imprimir(niveles);
        new DmFiguraF6().imprimir(niveles);
        new DmFiguraF7().imprimir(niveles);
        new DmFiguraF8().imprimir(niveles);
        new DmFiguraF9().imprimir(niveles);
        new DmFiguraF10().imprimir(niveles);
        new DmFiguraF11().imprimir(niveles);
        new DmFiguraF12().imprimir(niveles);
    
        scanner.close();
    }
}