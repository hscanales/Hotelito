/*
 * Se hablo con Nestor sobre los commits y autores, a partir de las 3:20 del dia 
 * 2 de mayo de 2018, los autores que realizaran los commits son: hscanales, NitroSkate
 * Vixtor61, MaPache07
 */
package hotelito;

/**
 *
 * @author HsCanales <00136317@uca.edu.sv>,
 */
public class Hotelito {
    /**Con esta funcion se manda a llamar una instancia del menu para poder
     * inicializar el programa que permitira al usuario poder hacer, modificar
     * o eliminar aspectos que se ofrecen en el hotel, para lo cual fue 
     * diseñado el siguiente codigo
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Menu menu=Menu.getInstance();
        
        menu.start();
   
       
    }
    
}
