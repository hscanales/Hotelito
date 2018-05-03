/*
 * 
 * 
 * 
 */
package hotelito;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author HsCanales <00136317@uca.edu.sv>
 */
public class Auxiliar {
    Scanner input = new Scanner(System.in);
    
    
    Auxiliar() {
    }

    ;

    void print(String s) {
        System.out.println(s);
    }

    ;
    void print(int i) {
        System.out.print(i);
    }

    ;
    void print(int[] i) {
        System.out.print(Arrays.toString(i));
    }

    void print(double d) {
        System.out.print(d);
    }

    ;
    void print(boolean n) {
        System.out.print(n + "\n");
        
    }

    void print(String[] s) {
        System.out.print(Arrays.toString(s));
    }

    void n(int k) {
        for (int i = 1; i <= k; ++i) {
            System.out.print("\n");
        }
    }

    ;
    void n() {
        System.out.print("\n");
    }
}
