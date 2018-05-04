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
