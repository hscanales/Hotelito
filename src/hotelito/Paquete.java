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
public class Paquete {
    private boolean isPremium;
    private boolean isBasic;
    private int Costo;

    public void setIsPremium(boolean isPremium) {
        this.isPremium = isPremium;
    }
    
    public boolean isIsPremium() {
        return isPremium;
    }
    
    public void setIsBasic(boolean isBasic) {
        this.isBasic = isBasic;
    }
    
    public boolean isIsBasic() {
        return isBasic;
    }
    
    public void setCosto(int Costo) {
        this.Costo = Costo;
    }
    
    public int getCosto() {
        return Costo;
    }


    
    
}
