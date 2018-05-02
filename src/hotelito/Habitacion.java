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
    private int Costo;
    private char Correlativo;
    private int Piso;
    private boolean isReserved;
    private boolean isAvailable;
    
    public void setTipo(String Tipo){
        this.Tipo = Tipo;
    }
    
    public String getTipo(){
        return Tipo;
    }
    
    public void setCosto(int Costo){
        this.Costo = Costo;
    }
    
    public int getCosto(){
        return Costo;
    }
    
    public void setCorrelativo(char Correlativo){
        this.Correlativo = Correlativo;
    }
    
    public char getCorrelativo(){
        return Correlativo;
    }
    
    public void setPiso(int Piso){
        this.Piso = Piso;
    }
    
    public int getPiso(){
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
