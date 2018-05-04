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
import java.util.ArrayList;
import java.util.Scanner;

public class Reservacion extends Hotel{
    private int dias;
    private Habitacion habitacion;
    private Paquete paquete;
    private Cliente cliente;
    private double total;
    
    public Reservacion(){}
    
    public Reservacion(int dias, Habitacion habitacion, Paquete paquete, Cliente cliente) {
        this.dias = dias;
        this.habitacion = habitacion;
        this.paquete = paquete;
        this.cliente = cliente;
        
        
        this.total=(paquete.getCosto()*this.dias)+(habitacion.getCosto()*this.dias);
        
    }
    public void Prin(){
        System.out.println(paquete.getCosto()+ " + "+ habitacion.getCosto() + " total: " +total);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getDias() {
        return dias;
    }
    public void setDias(int dias) {
        this.dias = dias;
    }
    public Habitacion getHabitacion() {
        return habitacion;
    }
    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
    public Paquete getPaquete() {
        return paquete;
    }
    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
   
    
    public int ValidarDias(){
        while(true){
            int dia;
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese la cantidad de dias");
            dia = leer.nextInt();
            if (dia <= 7){
                setDias(dia);
                return dia;
            }
            System.err.println("La cantidad de dias que ingreso es mayor que el limite ");
        }
    }
}
