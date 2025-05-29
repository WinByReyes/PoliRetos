package esLoading;

public class EsLoadingLO2 {
public static void main(String[] args) {
    EsLoadingLO2 programa = new EsLoadingLO2(); // Crear una instancia para usar los métodos normales (no static)
    programa.carga(); // o programa.caracterCarga(); si quieres la versión con símbolo del usuario
    programa.caracterCarga(); // Llamar al método para pedir símbolo al usuario y mostrar la carga
    programa.simboloCarga(); // Llamar al método para cargar con símbolo
    programa.cargaFija(); // Llamar al método para carga fija
    programa.cargaBarra1();
    programa.cargaFlecha();
    programa.cargaGiratoria1(); // Llamar al método para carga giratoria
    programa.cargaNombre();
    programa.nombreFila();
    programa.figuraRotativa();
}  
    public void carga() {
        Controller controller = new Controller();
        controller.mostrarCarga();
        System.out.println(); // Esto salta a la siguiente línea

    }
    public void caracterCarga() {
        Controller controller = new Controller();
        controller.cargaCaracter();
        System.out.println();
    }
    public void simboloCarga() {
        Controller controller = new Controller();
        controller.cargaSimbolo();
        System.out.println();
    }
    public void cargaFija() {
        Controller controller = new Controller();
        controller.cargaSoloPorcentaje();
        System.out.println();
    }
    public void cargaSoloPorcentaje() {
        Controller controller = new Controller();
        controller.cargaSoloPorcentaje();
        System.out.println();
    }
    public void cargaBarra1() {
        Controller controller = new Controller();
        controller.cargaBarra();
        System.out.println();
    }
    public void cargaFlecha() {
        Controller controller = new Controller();
        controller.flechaMoviendose();
        System.out.println();
    }
    public void cargaGiratoria1() {
        Controller controller = new Controller();
        controller.cargaGiratoria();
        System.out.println();
    }
    public void cargaNombre() {
        Controller controller = new Controller();
        controller.nombreCarga();
        System.out.println();
    }
    public void nombreFila() {
        Controller controller = new Controller();
        controller.nombreCompleto();
        System.out.println();
    }	
    public void figuraRotativa() {
        Controller controller = new Controller();
        controller.figuraRotacion();
        System.out.println();

}
}


