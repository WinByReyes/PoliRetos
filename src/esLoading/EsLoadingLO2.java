package esLoading;

public class EsLoadingLO2 {
public static void main(String[] args) {
    EsLoadingLO2 programa = new EsLoadingLO2(); // Crear una instancia para usar los métodos normales (no static)
    programa.carga(); // o programa.caracterCarga(); si quieres la versión con símbolo del usuario
    programa.caracterCarga(); // Llamar al método para pedir símbolo al usuario y mostrar la carga
    programa.simboloCarga(); // Llamar al método para cargar con símbolo
    programa.cargaFija(); // Llamar al método para carga fija
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

}


