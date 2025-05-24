package dmFiguras;


import Utility.validarIngreso;

public class ControllerF1toF12 {

    public void showFiguras() {
        
        System.out.println("\u001B[31;1mFIGURAS\u001B[0m");
        System.out.println("Ingrese el nivel de la figura que desea imprimir");
        int niveles = validarIngreso.validarIngresoNumero();

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
        new dsFiguraF13().crearFiguraF13(niveles);

    
    }
}