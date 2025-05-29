import emArrays.emA01;
import emArrays.emA02;
import emArrays.emA03;
import emArrays.emA04;
import emArrays.emA05;
import emCadena.emC04;
import emCadena.emC05;
import emCadena.emC06;
import emCadena.emC07;
import emCadena.emC08;
import emCadena.emC09;

public class emGestorPkg {

    /**
     * Muestra la frase sin la letra indicada por el usuario.
     */
    public void emMostrarFraseSinLetra() {
        emC04 c04 = new emC04();
        c04.fraseFinal();
    }

    /**
     * Muestra la frase invertida con las vocales en mayúsculas.
     */
    public void emMostrarFraseInvertidaVocalMayus() {
        emC05 c05 = new emC05();
        c05.emFrase05();
    }

    /**
     * Muestra la frase invertida con las letras en mayúsculas.
     */
    public void emMostrarFraseInvertidaLetrasMayus() {
        emC06 c06 = new emC06();
        c06.emFrase06();
    }

    /**
     * Muestra la frase convertida sin la letra 'j'.
     */
    public void emMostrarFraseConvertidaSinJ() {
        emC07 c07 = new emC07();
        c07.emConvertirSinJ();
    }        

    /**
     * Muestra los anagramas y permite al usuario intentar adivinarlos.
     */
    public void emMostrarAnagramas() {
        emC08 c08 = new emC08();
        c08.emAnagrama();
    }

    /**
     * Muestra una frase alternando entre mayúsculas y minúsculas.
     */
    public void emMostrarFraseAlternandoMayusMinus() {
        emC09 c09 = new emC09();
        c09.emFrase09();
    }

    /**
     * Muestra el porcentaje de carga para cada nombre del paquete.
     */
    public void emMostrarPorcentajeNombre() {
        emA01 a01 = new emA01();
        a01.emMostrarCargaNombre();
    }

    /**
     * Muestra las iniciales en forma de matriz
     */
    public void emMostrarInicialEnMatriz(){
        emA02 a02 = new emA02();
        a02.emMostrarInicialMatriz();
    }

    /**
     * Muestra el nombre en el plano
     */
    public void emMostrarNomPlano(){
        emA03 a03 = new emA03();
        a03.emMostrarNombrePlano();
    }

    /**
     * Muestra el nombre y apellido en cruz
     */
    public void emMostrarNombreCruz(){
        emA04 a04 = new emA04();
        a04.emMostrarNombreCruz();
    }

    /**
     * Muestra el nombre y apellido en una matriz cuadrada que complete con * los espacios que coinciden
     */
    public void emMatrizNomCuadrada(){
        emA05 a05 = new emA05();
        a05.emMatrizNomCuadrada();
    }

}
