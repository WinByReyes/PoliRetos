package esLoading;

import Utility.*;

public class esLoading02 {
    public  char caracterIngresado() {
        // Pedir al usuario que ingrese un símbolo para mostrar en la carga
        System.out.print("Ingrese un símbolo para mostrar en la carga: ");
        char caracter = Lector.sc.next().charAt(0);
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
}
