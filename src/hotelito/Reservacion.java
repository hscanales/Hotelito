/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelito;

/**
 *Clase reservacion donde se guardan los datos
 * de la reservacion de un hotel
 * @author nitroskate
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Reservacion extends Hotel{
    private int dias;
    private Habitacion habitacion;
    private Paquete paquete;
    private Cliente cliente;
    private double total;
    
    public Reservacion(){}
    /**
     * Constructor reservacion
     * @param dias
     * @param habitacion
     * @param paquete
     * @param cliente 
     */
    public Reservacion(int dias, Habitacion habitacion, Paquete paquete, Cliente cliente) {
        this.dias = dias;
        this.habitacion = habitacion;
        this.paquete = paquete;
        this.cliente = cliente;
        
        
        this.total=(paquete.getCosto()*this.dias)+(habitacion.getCosto()*this.dias);
        
    }
    /**
     * funcion para mostrar los costos
     */
    public void Prin(){
        System.out.printf(paquete.getCosto()+ " "+ habitacion.getCosto() + " total: " +total);
    }
    /**
     * Funcion que obtiene los datos del cliente para poder modificar los datos de
     * este mismo y acceder a otras funciones de este mismo
     * @return cliente 
     */

    public Cliente getCliente() {
        return cliente;
    }
    /**
     * 
     * @param cliente 
     */

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
/**
 * Getter que retorna un valor de dias
 * @return dias 
 */
    public int getDias() {
        return dias;
    }
    /**
     * Setter que funciona para configurar los dias de hospedaje
     * @param dias 
     */
    public void setDias(int dias) {
        this.dias = dias;
    }
    /**
     * 
     * @return habitacion 
     */
    public Habitacion getHabitacion() {
        return habitacion;
    }
    /**
     * 
     * @param habitacion 
     */
    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
    /**
     * 
     * @return paquete 
     */
    public Paquete getPaquete() {
        return paquete;
    }
    /**
     * 
     * @param paquete 
     */
    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }
/**
 * 
 * @return total 
 */
    public double getTotal() {
        return total;
    }

    /**
     * Setter que sirve para configurar los datos del total
     * @param total 
     */
    
    public void setTotal(double total) {
        this.total = total;
    }
   /**
    * Valida que el dia indicado este
    * dentro del limite deseado
    * @return dia
    */
    public int ValidarDias(){
        while(true){
            int dia;
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese la cantidad de dias");
            dia = leer.nextInt();
            if (dia <= 7){ //Limite de dias
                setDias(dia);
                return dia;
            }
            System.err.println("La cantidad de dias que ingreso es mayor que el limite ");
        }
    }
}
