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

    public String getPrimerNom() {
        return PrimerNom;
    }

    public void setPrimerNom(String PrimerNom) {
        this.PrimerNom = PrimerNom;
    }

    public String getSegundoNom() {
        return SegundoNom;
    }

    public void setSegundoNom(String SegundoNom) {
        this.SegundoNom = SegundoNom;
    }

    public String getPrimerApe() {
        return PrimerApe;
    }

    public void setPrimerApe(String PrimerApe) {
        this.PrimerApe = PrimerApe;
    }

    public String getSegundoApe() {
        return SegundoApe;
    }

    public void setSegundoApe(String SegundoApe) {
        this.SegundoApe = SegundoApe;
    }
    
    public String ValidarPrimerNombre(String n){
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
                n= in.next();
                x=false;
                
            }
            catch (NumberFormatException f){
                System.err.println("Nombre escrito correctamente");
                x=true;
            }
        }
        return n;

    }
    
    public String ValidarSegundoNombre(String n){
        boolean x=false;
        Scanner in = new Scanner(System.in);
        while(x==false){
            try{
                Integer.parseInt(n);
                System.out.println("Escriba un nombre con letras.");
                n= in.next();
                x=false;
                
            }
            catch (NumberFormatException f){
                System.err.println("Nombre escrito correctamente");
                x=true;
            }
        }
        
        return n;

    }
    
    public String ValidarPrimerApellido(String n){
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
                n= in.next();
                y=false;
                
            }
            catch (NumberFormatException f){
                System.err.println("Apellido escrito correctamente");
                y=true;
            }
        }
        
        return n;

    }
    
    public String ValidarSegundoApellido(String n){
        boolean y=false;
        Scanner in = new Scanner(System.in);
        while(y==false){
            try{
                Integer.parseInt(n);
                System.out.println("Escriba un apellido con letras.");
                n= in.next();
                y=false;
                
            }
            catch (NumberFormatException f){
                System.err.println("Apellido escrito correctamente");
                y=true;
            }
        }
        
        return n;

    }
    
}
