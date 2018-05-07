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
    private String Piso;
    private boolean isReserved;
    private boolean isAvailable;
    /**
     * Constructor de la clase habitacion
     */
    public Habitacion(){
        
    }
    /**
     * 
     * @param Tipo 
     */
    
    public void setTipo(String Tipo){
        this.Tipo = Tipo;
    }
    /**
     * 
     * @return 
     */
    
    public String getTipo(){
        return Tipo;
    }
    /**
     * 
     * @param Costo 
     */
    public void setCosto(double Costo){
        this.Costo = Costo;
    }
    /**
     * 
     * @return 
     */
    public double getCosto(){
        return Costo;
    }
    /**
     * 
     * @param Correlativo 
     */
    public void setCorrelativo(int Correlativo){
        this.Correlativo = Correlativo;
    }
    /**
     * 
     * @return 
     */
    public int getCorrelativo(){
        return Correlativo;
    }
    /**
     * 
     * @param Piso 
     */
    public void setPiso(String Piso){
        this.Piso = Piso;
    }
    /**
     * 
     * @return 
     */
    public String getPiso(){
        return Piso;
    }
/**
 * 
 * @param isReserved 
 */
    public void setIsReserved(boolean isReserved) {
        this.isReserved = isReserved;
    }
   /**
    * 
    * @return 
    */ 
    public boolean IsReserved() {
        return isReserved;
    }
/**
 * 
 * @param isAvailable 
 */
    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
   /**
    * 
    * @return 
    */ 
        public boolean IsAvailable() {
        return isAvailable;
    }

    public Habitacion(String Tipo, double Costo, int Correlativo, String Piso, boolean isReserved, boolean isAvailable) {
        this.Tipo = Tipo;
        this.Costo = Costo;
        this.Correlativo = Correlativo;
        this.Piso = Piso;
        this.isReserved = isReserved;
        this.isAvailable = isAvailable;
    }
    
    
}
