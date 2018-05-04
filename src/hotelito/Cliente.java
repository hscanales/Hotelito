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
    private Reservacion res;
    private String nombre, tarcre, dui;
    private float costo, coston;
    
    public Cliente (){}
    
    public Cliente(String dui){
        this.dui = dui;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTarcre(String tarcre) {
        this.tarcre = tarcre;
    }
    public void setDui(String dui) {
        this.dui = dui;
    }
    public void setCosto(float costo) {
        this.costo = costo;
    }
    public void setCoston(float coston) {
        this.coston = coston;
    }

    public String getNombre() {
        return nombre;
    }
    public String getTarcre() {
        return tarcre;
    }
    public String getDui() {
        return dui;
    }
    public float getCosto() {
        return costo;
    }
    public float getCoston() {
        return coston;
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
    
    /* Validar el costo en el menu, para despuestio 
    public double validarCosto(double c){
        boolean y=false;
        Scanner in = new Scanner(System.in);
        while(y==false){
            try{
                System.out.println("Escriba un apellido con letras.");
                y=true;
                
            }
            catch (InputMismatchException f){
                System.err.println("Ingrese un dato numerico.");
                c=in.nextDouble();
                y=false;
            }
        }
        
        return c;
    }*/
    
}
