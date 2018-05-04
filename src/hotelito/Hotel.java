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
public class Hotel extends Auxiliar {

    ArrayList<Habitacion> habitaciones = new ArrayList<>();
    ArrayList<Reservacion> reservaciones = new ArrayList<>();
    ArrayList<Paquete> paquetes = new ArrayList<>();
    ArrayList<String> hab = new ArrayList<>();
    private int npisos = 6;

    public Hotel() {
        String[] pisos = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        Paquete premium = new Paquete(150,"Descripcion pendiente","Premiun","1");
        Paquete basico = new Paquete(10,"Descripcion pendiente","Basico","2");
        
        paquetes.add(basico);
        paquetes.add(premium);
        
        for (int i = 1; i <= npisos; i++) {
            for (int j = 1; j <= 10; j++) {
                String n = String.valueOf(j);
                if (i >= npisos-3){
                    if (j % 2 == 0) {
                        habitaciones.add(new Habitacion("Double", 165, j, pisos[i - 1], false, false));
                    } else {
                        habitaciones.add(new Habitacion("Single", 137.5, j, pisos[i - 1], false, false));
                    }
                }
                else{
                    if (j % 2 == 0) {
                        habitaciones.add(new Habitacion("Double", 150, j, pisos[i - 1], false, false));
                    } else {
                        habitaciones.add(new Habitacion("Single", 125, j, pisos[i - 1], false, false));
                    }
                }
                hab.add(pisos[i - 1] + n);
            }
        }
    }
    
    void setNpisos(int npisos){
        this.npisos = npisos;
    } 
    int getNpisos(){
        return npisos;
    }
    
    public ArrayList<Paquete> getPaquetes(){
        return paquetes;
    }
    public void setPaquetes(ArrayList<Paquete> paquetes){
        this.paquetes = paquetes;
    }
    
    void HabitacionesDisponibles() {
        print("Las Habitaciones disponibles son: ");
        habitaciones.forEach((Habitacion habitacion) -> {
            if ((habitacion.IsReserved() || habitacion.IsAvailable()) == false) {
                String s = habitacion.getPiso() + "" + habitacion.getCorrelativo() + ", ";
                System.out.print(s);
            }
        });
    }

    void DeshabilitarPiso(String a) {

        for (Habitacion Hab : habitaciones) {
            if (a.equals(Hab.getPiso())) {
                Hab.setIsAvailable(true);
            }
        }
    }

    void DeshabilitarHab(String a, int b) {
        for (Habitacion Hab : habitaciones) {
            if ((a.equals(Hab.getPiso())) && (Hab.getCorrelativo() == b)) {
                Hab.setIsAvailable(true);
            }
        }
    }
    
    void HabilitarPiso(String a) {

        for (Habitacion Hab : habitaciones) {
            if (a.equals(Hab.getPiso())) {
                Hab.setIsAvailable(false);
            }
        }
    }

    void HabilitarHab(String a, int b) {
        for (Habitacion Hab : habitaciones) {
            if ((a.equals(Hab.getPiso())) && (Hab.getCorrelativo() == b)) {
                Hab.setIsAvailable(false);
                Hab.setIsReserved(false);
            }
        }
    }
    
    void PonerPrecio(String a, int b, double c){
        for(Habitacion Hab: habitaciones){
            if ((a.equals(Hab.getPiso())) && Hab.getCorrelativo() == b){
                Hab.setCosto(c);
            }
        }
    }

    void test() {
        int a = input.nextInt();
        print(a);
    }

    boolean verificarCliente(String dui) {
        Cliente g = new Cliente();
        if (g.validarDui(dui)) {

            for (Reservacion rev : reservaciones) {
                if (dui.equals(rev.getCliente().getDui())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    boolean verificarHabitacion(String a, int b) {
        for (Habitacion Hab : habitaciones) {
            if ((a.equals(Hab.getPiso())) && (Hab.getCorrelativo() == b)) {
                if (!Hab.IsAvailable() && !Hab.IsReserved()) {
                    return true;
                }
            }
        }
        return false;
    }

    void ReservarHabitacion(String a, int b) {
        for (Habitacion Hab : habitaciones) {
            if ((a.equals(Hab.getPiso())) && (Hab.getCorrelativo() == b)) {
                print("hola");
                Hab.setIsReserved(true);
            }
        }
    }

    void HacerReservacion(String dui, String a, int b, Paquete p, int dia) {
        //HabitacionesDisponibles();
        boolean flag = false;
        if (verificarCliente(dui)) {
            if (verificarHabitacion(a, b)) {
                Cliente c = new Cliente(dui);
                ReservarHabitacion(a, b);

                for (Habitacion Hab : habitaciones) {
                    if ((a.equals(Hab.getPiso())) && (Hab.getCorrelativo() == b)) {
                        Reservacion v = new Reservacion(dia, Hab, p, c);
                        v.Prin();
                        reservaciones.add(v);
                        flag = true;
                    }
                }
            }
        }
        if (!flag) {
            System.out.println("No se hizo la reservacion ");
        }
    }
    
    void MostrarReservacion(){
        if (reservaciones.isEmpty()){
            System.out.println("No hay reservaciones hechas");
        }
        else{
            for (Reservacion most: reservaciones){
                System.out.println(most.getHabitacion().getPiso()+most.getHabitacion().getCorrelativo());
            //habitacion, letra y correlativo, cant hab, dias y paquete, nombre y apellido primero
                
            }
            
        }
    }


  void EliminarReservacion(String dui) {
        int cont = 0;
        int j=0;
        int a=0;
        String d = "";
        boolean k = false;
        for (Reservacion rev : reservaciones) {
            

            if (dui.equals(rev.getCliente().getDui())) {
                
                j = cont;
                k = true;
                a = rev.getHabitacion().getCorrelativo();
                d = rev.getHabitacion().getPiso();
                
                
            }
            /*else{
                print("GGGGG");
                reservaciones.remove(rev);
              
                print("HGGGGHH");
            }*/
            cont++;

        }
        if(k){
            print("HOLA");
            reservaciones.remove(j);
            for(Habitacion h: habitaciones){
                if(d.equals(h.getPiso()) && h.getCorrelativo() == a){
                    print("Se habilita la habitacion" + " " + d + a);
                    HabilitarHab(d,a);
                }
            }
        }
       
        
    }

    void CrearPaquete() {
        boolean flag = true;
        double costo;
        String nombre, descrip, codigo;

        print("Vamos a crear un nuevo Paquete: ");

        print("Ingrese nombre del paquete: ");
        nombre = input.nextLine();

        print("Ingrese costo del paquete: ");
        costo = Double.parseDouble(input.nextLine());

        print("Ingrese descripcion de servicios incluidos en el paquete: ");
        descrip = input.nextLine();

        while (flag) {

            print("Ingrese un codigo destinado para identificar el paquete: ");
            codigo = input.nextLine();

            if (paquetes.isEmpty()) {
                Paquete paqueteN = new Paquete(costo, descrip, nombre, codigo);
                paquetes.add(paqueteN);
                flag = false;
            } else {
                for (Paquete pack : paquetes) {
                    if (codigo.equals(pack.getCodigo())) {
                        print("No puedes utilizar ese codigo utiliza no nuevo");
                    } else {
                        Paquete paqueteN = new Paquete(costo, descrip, nombre, codigo);
                        paquetes.add(paqueteN);
                        flag = false;

                    }
                }
            }
        }

    }

    void MostrarPaquetes() {
        if (paquetes.isEmpty()) {
            print("No tiene paquetes registrados en el hotel");
        } else {
            paquetes.forEach(paquete -> {
                System.out.print(paquete.getNombre());
            });
            n();
        }
    }

}
