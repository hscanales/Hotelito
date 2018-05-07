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


public class Cliente extends Nombre{
    
    private String tarcre, dui;
  
    
    public Cliente (){}
    
    public Cliente(String dui){
        this.dui = dui;
    }

 
    public void setTarcre(String tarcre) {
        this.tarcre = tarcre;
    }
    public void setDui(String dui) {
        this.dui = dui;
    }
   
 
    public String getTarcre() {
        return tarcre;
    }
    public String getDui() {
        return dui;
    }
  
    
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
        //String dui="CENSORED";
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
   // System.out.println(auxiliar);
        if((10-(total%10))==auxiliar){
            return true;
        }
        return false;
    }    
    
}
