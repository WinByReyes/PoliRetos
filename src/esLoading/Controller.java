package esLoading;
import java.util.Scanner;
public class Controller {
        public  void mostrarCarga() {
        // Indicador de carga desde 0 a 100% usando los signos \|/-| para simular un movimiento rotacional de carga 0% hasta 100%
        String[] loadingSymbols = {"|", "/", "-", "\\"};
        int totalSteps = 100;
        for (int i = 0; i <= totalSteps; i++) {
            int symbolIndex = i % loadingSymbols.length;
            String symbol = loadingSymbols[symbolIndex];
            System.out.print("\rCargando " + i + "% " + symbol);
            try {
                Thread.sleep(100); // Simula un tiempo de carga
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restaurar el estado de interrupción
                System.err.println("Carga interrumpida");
            }
        }
    }
        public  char caracterIngresado() {
        // Pedir al usuario que ingrese un símbolo para mostrar en la carga
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un símbolo para mostrar en la carga: ");
        char caracter = scanner.next().charAt(0);
        return caracter; 
     } 
        public  void cargaCaracter() {
        //Mostrar carga con el símbolo ingresado por el usuario en una barra de longuitud 20
        char caracter = caracterIngresado();
        int totalSteps = 20; // Longitud de la barra de carga
        for (int i = 0; i <= totalSteps; i++) {
            StringBuilder barraCarga = new StringBuilder();
            for (int j = 0; j < i; j++) {
                barraCarga.append(caracter);
            }
            System.out.print("\rCargando [" + barraCarga.toString() + "]");
            try {
                Thread.sleep(100); // Simula un tiempo de carga
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restaurar el estado de interrupción
                System.err.println("Carga interrumpida");

        
     }
        
             


}
}
        public char simboloIngresado() {
        // Método para pedir un símbolo al usuario y devolverlo
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un símbolo para mostrar en la carga: ");
        char simbolo = scanner.next().charAt(0);
        return simbolo;
}
        public void cargaSimbolo() {
    // Método: desplazar el símbolo ingresado de izquierda a derecha
    char simbolo = simboloIngresado();
    int totalSteps = 20; // Longitud de la barra de carga

    for (int i = 0; i <= totalSteps; i++) {
        StringBuilder barraCarga = new StringBuilder();

        for (int j = 0; j < totalSteps; j++) {
            if (j == i) {
                barraCarga.append(simbolo); // Pone el símbolo solo en la posición actual
            } else {
                barraCarga.append(" "); // Espacios en las otras posiciones
            }
        }

        System.out.print("\rCargando [" + barraCarga.toString() + "] " + (i * 5) + "%");

        try {
            Thread.sleep(100); // Simula tiempo de carga
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Carga interrumpida");
        }
    }

    System.out.println(); // Salto de línea al final
}
        public void cargaSoloPorcentaje() {
    String[] animaciones = {"o0o", "0o0"};
    int totalSteps = 20; // 100% / 5 = 20 pasos

    for (int i = 0; i <= totalSteps; i++) {
        String frame = animaciones[i % 2]; // Alterna entre o0o y 0o0
        int porcentaje = i * 5;
        System.out.print("\r" + frame + " " + porcentaje + "%");

        try {
            Thread.sleep(100); // Simula tiempo de carga
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Carga interrumpida");
        }
    }

    System.out.println(); // Salto de línea final
}
        public void cargaBarra() {
            
            String [] loadingSymbols = {"=", ">"};
            int totalSteps = 20; // Longitud de la barra de carga
        
            for (int i = 0; i <= totalSteps; i++) {
                StringBuilder barraCarga = new StringBuilder();
                int porcent= i * 5; // Calcula el porcentaje de carga (0% a 100%)
                for (int j = 0; j < totalSteps; j++) {
                    if (j < i) {
                        barraCarga.append(loadingSymbols[0]); // Agrega el símbolo "="
                    } else if (j == i) {
                        barraCarga.append(loadingSymbols[1]); // Agrega el símbolo ">"
                    } else {
                        barraCarga.append(" "); // Espacios en las otras posiciones
                    }
                }
                System.out.print("\rCargando [" + barraCarga.toString() + "]" + " " + porcent + "%");
                try {
                    Thread.sleep(100); // Simula un tiempo de carga
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // Restaurar el estado de interrupción
                    System.err.println("Carga interrumpida");
                }
            }
            System.out.println(); // Salto de línea final
      }   
        public void flechaMoviendose(){
            //Metodo de una barra de 20 caracteres, la barra <=> debe moverse de izquierda a derecha
            String barra = "<=>";
            int totalSteps = 20; // Longitud de la barra de carga
            for (int i = 0; i <= totalSteps; i++) {
                StringBuilder barraCarga = new StringBuilder();
                for (int j = 0; j < totalSteps; j++) {
                    if (j == i) {
                        barraCarga.append(barra); // Pone la flecha solo en la posición actual
                    } else {
                        barraCarga.append(" "); // Espacios en las otras posiciones
                    }
                }
                System.out.print("\rCargando [" + barraCarga.toString() + "] " + (i * 5) + "%");
                try {
                    Thread.sleep(100); // Simula tiempo de carga
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.err.println("Carga interrumpida");
                }
            }
        }
        public void cargaGiratoria() {
            //crear una barra de 20 caracteres, la barra avanza cambiando la punta con movimiento rotacional signos;  \|/-| 
            String[] loadingSymbols = {"|", "/", "-","\\"};
            int totalSteps = 20; // Longitud de la barra de carga
            for (int i = 0; i <= totalSteps; i++) {
                StringBuilder barraCarga = new StringBuilder();
                int symbolIndex = i % loadingSymbols.length;
                String symbol = loadingSymbols[symbolIndex];
                int porcentaje1 = i * 5; // Calcula el porcentaje de carga (0% a 100%)
                for (int j = 0; j < totalSteps; j++) {
                    if (j < i) {
                        barraCarga.append("="); // Agrega el símbolo "="
                    } else if (j == i) {
                        barraCarga.append(symbol); // Agrega el símbolo de carga rotacional
                    } else {
                        barraCarga.append(" "); // Espacios en las otras posiciones
                    }
                }
                System.out.print("\rCargando [" + barraCarga.toString() + porcentaje1 + "%]");
                try {
                    Thread.sleep(100); // Simula un tiempo de carga
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // Restaurar el estado de interrupción
                    System.err.println("Carga interrumpida");
                }
            }
     }
      
        public String nombreApellido() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese su nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese su apellido: ");
            String apellido = scanner.nextLine();
            return nombre + " " + apellido; // Devuelve el nombre completo
        }
        public void nombreCarga(){
            //Crea una funcion el nombre y apellidos y realizar la carga mostrando letra a letra hasta el 100% 
            String nombreCompleto = nombreApellido();
            int totalSteps = 20; // Longitud de la barra de carga
            for (int i = 0; i <= totalSteps; i++) {
                StringBuilder barraCarga = new StringBuilder();
                int porcentaje = i * 5; // Calcula el porcentaje de carga (0% a 100%)
                for (int j = 0; j < totalSteps; j++) {
                    if (j < i) {
                        barraCarga.append(nombreCompleto.charAt(j % nombreCompleto.length())); // Agrega el carácter del nombre
                    } else if (j == i) {
                        barraCarga.append("|"); // Agrega un separador al final
                    } else {
                        barraCarga.append(" "); // Espacios en las otras posiciones
                    }
                }
                System.out.print("\rCargando [" + barraCarga.toString() + "] " + porcentaje + "%");
                try {
                    Thread.sleep(100); // Simula un tiempo de carga
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // Restaurar el estado de interrupción
                    System.err.println("Carga interrumpida");
                }
            }
            System.out.println(); // Salto de línea final
        }
        public void nombreCompleto() {
         //llama a la funcion nombre y apellido
            String nombreCompleto = nombreApellido();
            System.out.println("Nombre completo: " + nombreCompleto);
         
            //Pedir y mostrar el nombre completo, mostrando solo una letra en la misma linea 0% hasta 100% 
            int totalSteps = nombreCompleto.length(); // Longitud del nombre completo
            for (int i = 0; i < totalSteps; i++) {
                StringBuilder barraCarga = new StringBuilder();
                int porcentaje = (i + 1) * 100 / totalSteps; // Calcula el porcentaje de carga
                barraCarga.append(nombreCompleto.charAt(i)); // Agrega el carácter del nombre
                System.out.print("\rCargando [" + barraCarga.toString() + "] " + porcentaje + "%");
                try {
                    Thread.sleep(100); // Simula un tiempo de carga
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // Restaurar el estado de interrupción
                    System.err.println("Carga interrumpida");
                }
            }
        }	
        public void figuraRotacion() {
            //Haz que la figura se mueva de izquierda a derecha \|||/  (> <)  ooO-(_)-Ooo 
            String[] figuras = {"\\|||/", "(> <)", "ooO-(_)-Ooo"};
            int totalSteps = 20; // Longitud de la barra de carga
            for (int i = 0; i <= totalSteps; i++) {
                StringBuilder barraCarga = new StringBuilder();
                int figuraIndex = i % figuras.length;
                String figura = figuras[figuraIndex];
                int porcentaje = i * 5; // Calcula el porcentaje de carga (0% a 100%)
                for (int j = 0; j < totalSteps; j++) {
                    if (j < i) {
                        barraCarga.append("="); // Agrega el símbolo "="
                    } else if (j == i) {
                        barraCarga.append(figura); // Agrega la figura rotacional
                    } else {
                        barraCarga.append(" "); // Espacios en las otras posiciones
                    }
                }
                System.out.print("\rCargando [" + barraCarga.toString() + "] " + porcentaje + "%");
                try {
                    Thread.sleep(100); // Simula un tiempo de carga
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // Restaurar el estado de interrupción
                    System.err.println("Carga interrumpida");
                }
            }
                
        }
    
    }
       
 
  