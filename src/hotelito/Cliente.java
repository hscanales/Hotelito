    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelito;

/**
 *
 * @author nitroskate
 */
import java.util.Scanner;
import java.util.InputMismatchException;


/**
 * Clase Cliente que hereda de nombre y contiene
 * atributos: Tarjeta de credito, dui y los atributos de la clase nombre
 * @author NitroSkate <00159817@uca.edu.sv>
 */

public class Cliente extends Nombre{
    
    private String tarcre, dui;
  
    
    public Cliente (){}
    /**
     * Constructor de cliente
     * @param dui 
     */
    public Cliente(String dui){
        this.dui = dui;
    }
/**
 * Setter que permite modificar o ingresar un dato de tipo string
 * @param tarcre 
 */
 
    public void setTarcre(String tarcre) {
        this.tarcre = tarcre;
    }
    /**
     * Funcion setter que permite ingresar o modificar el dui
     * @param dui 
     */
    public void setDui(String dui) {
        this.dui = dui;
    }
   
    /**
     * Funcion getter que retorna el valor de la tarjeta de credito
     * @return 
     */
 
    public String getTarcre() {
        return tarcre;
    }
    /**
     * Funcion getter que retorna el valor del dui ingresado o 
     * modificado
     * @return dui 
     */
    public String getDui() {
        return dui;
    }
  /**
   * Funcion que se encarga de verificar que cuando se ingrese una tarjeta de credito, esta
   * tenga la cantidad de digitos correcta, si no lo cumple muestra un mensaje que
   * la tarjeta ingresada es invalidad y permite al usuario volverlo  intentar
   */
    
    public void ValidarTarCre(){
        int flag = 1;
        while(flag == 1){
            String tarjeta;
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese su tarjeta de crédito: ");
            tarjeta = leer.next();
            
            if (12 == tarjeta.length()){
                setTarcre(tarjeta);
                flag = 0;
            }
            else{
                System.err.println("La tarjeta de crédito que ingreso no es valida");
            }
        }
    }
    
    /**
     * ValidarDui sirve para validar que el dui ingresado cumpla con todos los requerimientos
     * que un dui deba cumplir para verificar que tiene los digitos y sea un dui legitimo
     * @param dui
     * @return 
     */
    
    public boolean validarDui(String dui){
        
        int cont = 9;
        int auxiliar, total = 0;
        for(int i=0;i<dui.length()-1;i++){
            auxiliar= Integer.parseInt(String.valueOf(dui.charAt(i)))*cont;
            total += auxiliar;
            cont=cont-1;
        
        }
        if(dui.length()!=9){
           return false;
        }
     auxiliar = Integer.parseInt(String.valueOf(dui.charAt(8)));
  
        if((10-(total%10))==auxiliar){
            return true;
        }
        return false;
    }    
    
}
