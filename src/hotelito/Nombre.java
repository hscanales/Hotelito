    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelito;
import java.util.Scanner;
/**
 *
 * @author nitroskate
 */
public class Nombre {
    private String PrimerNom;
    private String SegundoNom;
    private String PrimerApe;
    private String SegundoApe;
    
    public Nombre(){
        
    }

    /** 
     * Los get y set de PrimerNom y SegundoNom hace que se obtengan y se modifiquen
     * los nombres que ingrese el usuario
     * @return PrimerNom
     */
    public String getPrimerNom() {
        if (PrimerNom == null){
            return "";
        }
        return PrimerNom;
    }
/**
 * 
 * @param PrimerNom 
 */
    public void setPrimerNom(String PrimerNom) {
        this.PrimerNom = PrimerNom;
    }
/**
 * 
 * @return SegundoNom 
 */
    public String getSegundoNom() {
        if (SegundoNom == null){
            return "";
        }
        return SegundoNom;
    }
/**
 * 
 * @param SegundoNom 
 */
    public void setSegundoNom(String SegundoNom) {
        this.SegundoNom = SegundoNom;
    }

    /**
     * Los set y get de PrimerApe y SegundoApe, funcionan para poder obtener
     * y modificar los apellidos que el usuario ingrese
     * @return PrimerApe 
     */
    
    public String getPrimerApe() {
        if (PrimerApe == null){
            return "";
        }
        return PrimerApe;
    }
/**
 * 
 * @param PrimerApe 
 */
    public void setPrimerApe(String PrimerApe) {
        this.PrimerApe = PrimerApe;
    }
/**
 * 
 * @return SegundoApe 
 */
    public String getSegundoApe() {
        if (SegundoApe == null){
            return "";
        }
        return SegundoApe;
    }
/**
 * 
 * @param SegundoApe 
 */
    public void setSegundoApe(String SegundoApe) {
        this.SegundoApe = SegundoApe;
    }
    
    /**
     * ValidarPrimerNombre funciona para vertificar que el nombre que se ha
     * ingresado no sea vacio o contenga datos numericos
     * @param n
     * @return 
     */
    
    public boolean ValidarPrimerNombre(String n){
        boolean x=false;
        
        Scanner in = new Scanner(System.in);
        while(n.length()==0){
            System.out.println("No ha escrito nada. Ingrese un nombre: ");
            n = in.next();
        }
        while(x==false){
            try{
                Integer.parseInt(n);
                System.out.println("Escriba un nombre con letras.");
                n= in.nextLine();
                this.PrimerNom = n;
                x=false;
                
                
            }
            catch (NumberFormatException f){
                System.err.println("Nombre escrito correctamente");
                x=true;
            }
        }
        return true;

    }
    
    /**
     * ValidarSegundoNombre es una funcion que verificar que el usuario no ingrese
     * datos numericos, pero puede dejarlo en blanco ya que no es requisito 
     * ingresar un segundo nombre, solo se requiere el primero
     * @param n
     * @return 
     */
    
    public boolean ValidarSegundoNombre(String n){
        boolean x=false;
        Scanner in = new Scanner(System.in);
        while(x==false){
            try{
                Integer.parseInt(n);
                System.out.println("Escriba un nombre con letras.");
                n= in.nextLine();
                this.SegundoNom = n;
                x=false;
                
            }
            catch (NumberFormatException f){
                System.err.println("Nombre escrito correctamente");
                x=true;
            }
        }
        
        return true;

    }
    
    /**
     * ValidarPrimerApellido funciona para que el usuario ingrese un apellido y 
     * no dejar en blanco este apartado y tambien verificar que no ingrese datos
     * numericos
     * @param n
     * @return 
     */
    
    
    public boolean ValidarPrimerApellido(String n){
        boolean y=false;
        Scanner in = new Scanner(System.in);
        while(n.length()==0){
            System.out.println("No ha escrito nada. Ingrese un apellido: ");
            n = in.next();
        }
        while(y==false){
            try{
                Integer.parseInt(n);
                System.out.println("Escriba un apellido con letras.");
                n= in.nextLine();
                this.PrimerApe = n;
                y=false;
                
            }
            catch (NumberFormatException f){
                System.err.println("Apellido escrito correctamente");
                y=true;
            }
        }
        
        return true;

    }
    
    /**
     * ValidarSegundoAPellido funciona para que el usuario cuando ingrese su 
     * apellido, no ingrese datos numericos, pero puede dejar este apartado sin
     * tener que poner un apellido
     * @param n
     * @return 
     */
    
    public boolean ValidarSegundoApellido(String n){
        boolean y=false;
        Scanner in = new Scanner(System.in);
        while(y==false){
            try{
                Integer.parseInt(n);
                System.out.println("Escriba un apellido con letras.");
                n= in.nextLine();
                this.SegundoApe = n;
                y=false;
                
            }
            catch (NumberFormatException f){
                System.err.println("Apellido escrito correctamente");
                y=true;
            }
        }
        
        return true;

    }
    
}
