/*
 * 
 * 
 * 
 */
package hotelito;

import java.util.ArrayList;

/**
 *
 * @author HsCanales <00136317@uca.edu.sv>
 */
public class Hotel extends Auxiliar{
    ArrayList<Habitacion> habitaciones = new ArrayList<>();

    public Hotel() {
        Habitacion A1= new Habitacion("Single",125,1,"A",false,false);  
        Habitacion A2= new Habitacion("Double",125,2,"A",true,false);  
        Habitacion A3= new Habitacion("Single",125,3,"A",false,false);  
        Habitacion A4= new Habitacion("Double",125,4,"A",true,false);  
        Habitacion A5= new Habitacion("Single",125,5,"A",false,false);  
        Habitacion A6= new Habitacion("Double",125,6,"A",false,true);  
        Habitacion B1= new Habitacion("Single",125,1,"B",false,false);
        habitaciones.add(A1);
        habitaciones.add(A2);
        habitaciones.add(A3);
        habitaciones.add(A4);
        habitaciones.add(A5);
        habitaciones.add(A6);
        habitaciones.add(B1);
    }
    
    void HabitacionesDisponibles(){
    print("Las Habitaciones disponibles son: ");
    habitaciones.forEach((Habitacion habitacion)-> {
        if((habitacion.IsReserved()||habitacion.IsAvailable())==false){
            String s= habitacion.getPiso() +"" + habitacion.getCorrelativo()+", ";
            System.out.print(s);
        }
        });
    }
    
        void DeshabilitarPiso(String a){

        for(Habitacion Hab: habitaciones){
            if(a.equals(Hab.getPiso())){
                Hab.setIsAvailable(true);
            }
        }
    }
        
        void DeshabilitarHab(String a,int b){
        for(Habitacion Hab: habitaciones){
            if((a.equals(Hab.getPiso()))&&(Hab.getCorrelativo() == b)){
                Hab.setIsAvailable(true);
            }
        }
    }
}
