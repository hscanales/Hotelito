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
public class Habitacion {
    private String Tipo;
    private float Costo;
    private int Correlativo;
    private char Piso;
    private boolean isReserved;
    private boolean isAvailable;
    
    public Habitacion(){
        
    }
    
    public void setTipo(String Tipo){
        this.Tipo = Tipo;
    }
    
    public String getTipo(){
        return Tipo;
    }
    
    public void setCosto(float Costo){
        this.Costo = Costo;
    }
    
    public float getCosto(){
        return Costo;
    }
    
    public void setCorrelativo(int Correlativo){
        this.Correlativo = Correlativo;
    }
    
    public int getCorrelativo(){
        return Correlativo;
    }
    
    public void setPiso(char Piso){
        this.Piso = Piso;
    }
    
    public char getPiso(){
        return Piso;
    }

    public void setIsReserved(boolean isReserved) {
        this.isReserved = isReserved;
    }
    
    public boolean isIsReserved() {
        return isReserved;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    
        public boolean isIsAvailable() {
        return isAvailable;
    }
    
    
}
