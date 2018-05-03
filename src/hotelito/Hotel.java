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
    ArrayList<Reservacion> reservaciones = new ArrayList<>();

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
        
        void test(){
            int a= input.nextInt();
            print(a);
        }
       boolean verificarCliente(String dui){
        for(Reservacion rev: reservaciones){
            if(dui.equals(rev.getCliente().getDui())){
                return false;
            }
        }
        return true;
    }
       boolean verificarHabitacion(String a,int b){
        for(Habitacion Hab: habitaciones){
            if((a.equals(Hab.getPiso()))&&(Hab.getCorrelativo() == b)){
               if(Hab.IsAvailable() && !Hab.IsReserved()){
                   return true;
               }
            }
        }
        return false;
    }
       void ReservarHabitacion(String a,int b){
        for(Habitacion Hab: habitaciones){
            if((a.equals(Hab.getPiso()))&&(Hab.getCorrelativo() == b)){
               Hab.setIsReserved(true);
               }
            }
        }
        
   
       
       void HacerReservacion(String dui,String a, int b){
          if(verificarCliente(dui)){
              if(verificarHabitacion(a,b)){
                  Cliente c= new Cliente(dui);
                  Paquete p = new Paquete();
                  ReservarHabitacion(a,b);
                  for(Habitacion Hab: habitaciones){
            if((a.equals(Hab.getPiso()))&&(Hab.getCorrelativo() == b)){
               Reservacion v = new Reservacion(7,Hab,p,c);
               reservaciones.add(v);
               }
            } 
                  
              }
          }
       }
 }
        

