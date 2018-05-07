/*
 * 
 * 
 * 
 */
package hotelito;

import java.util.Arrays;
import java.util.Scanner;

/**
 *Clase auxiliar para hacer el codigo un poco mas facil de escribir/leer,
 * incluye una manera mas facil de mostrar al usuario con "print()",
 * facilita el acceso a pedir datos al usuario con la libreria Scanner,
 * llamandola con "input", y utiliza "n()" para hacer lineas nuevas en blanco,
 * se le puede enviar un numero entero para mostrar una cantidad exacta de lineas
 * 
 * @author HsCanales <00136317@uca.edu.sv>
 */
public class Auxiliar {
    Scanner input = new Scanner(System.in);
    
    
    Auxiliar() {
    }

    
/**
 * Printea un String
 * @param s 
 */
    void print(String s) {
        System.out.println(s);
    }

    /**
     * Printea un Entero
     * @param i 
     */
    void print(int i) {
        System.out.print(i);
    }

    /**
     * Printea un Array de Enteros
     * @param i 
     */
    void print(int[] i) {
        System.out.print(Arrays.toString(i));
    }

    /**
     * Printea un Double
     * @param d 
     */
    void print(double d) {
        System.out.print(d);
    }

    /**
     * printea un boolean;
     * @param n 
     */
    void print(boolean n) {
        System.out.print(n + "\n");
        
    }

    /**
     * Printea un array de Strings
     * @param s 
     */
    void print(String[] s) {
        System.out.print(Arrays.toString(s));
    }

    /**
     * printea "k" lineas en blanco
     * @param k= cantidad de lineas a printear
     */
    void n(int k) {
        for (int i = 1; i <= k; ++i) {
            System.out.print("\n");
        }
    }

    /**
     * Printea una linea en blanco
     */
    void n() {
        System.out.print("\n");
    }
}
