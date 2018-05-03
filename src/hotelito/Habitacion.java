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
    private double Costo;
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
    
    public void setCosto(double Costo){
        this.Costo = Costo;
    }
    
    public double getCosto(){
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
    
    public boolean IsReserved() {
        return isReserved;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    
        public boolean IsAvailable() {
        return isAvailable;
    }

    public Habitacion(String Tipo, float Costo, int Correlativo, char Piso, boolean isReserved, boolean isAvailable) {
        this.Tipo = Tipo;
        this.Costo = Costo;
        this.Correlativo = Correlativo;
        this.Piso = Piso;
        this.isReserved = isReserved;
        this.isAvailable = isAvailable;
    }
    
    
}
