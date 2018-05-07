/*
 * 
 * 
 * 
 */
package hotelito;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *  Clase Maestra de Hotel
 *  Contiene todas las variables globales
 * @author HsCanales <00136317@uca.edu.sv>
 */
public class Hotel extends Auxiliar {

    ArrayList<Habitacion> habitaciones = new ArrayList<>();
    ArrayList<Reservacion> reservaciones = new ArrayList<>();
    ArrayList<Paquete> paquetes = new ArrayList<>();
    ArrayList<Cliente> cliente = new ArrayList<>();
    ArrayList<String> hab = new ArrayList<>();
    //Reservacion re = new Reservacion();
    Scanner in = new Scanner(System.in);
    Scanner in1 = new Scanner(System.in);
    private int npisos = 6;
/**
 * Constructor Clase Hotel
 * Llena el Hotel con 6 Pisos de 10 Habitaciones C/u
 * Llena el hotel con dos tipos de paquetes: Premiun y Basico
 * 
 */
    public Hotel() {
        String[] pisos = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        Paquete premium = new Paquete(150, "Descripcion pendiente", "Premiun", "1");
        Paquete basico = new Paquete(10, "Descripcion pendiente", "Basico", "2");

        paquetes.add(basico);
        paquetes.add(premium);

        for (int i = 1; i <= npisos; i++) {
            for (int j = 1; j <= 10; j++) {
                String n = String.valueOf(j);
                if (i >= npisos - 3) {
                    if (j % 2 == 0) {
                        habitaciones.add(new Habitacion("Double", 165, j, pisos[i - 1], false, false));
                    } else {
                        habitaciones.add(new Habitacion("Single", 137.5, j, pisos[i - 1], false, false));
                    }
                } else {
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
/**
 * Setea la cantidad de Pisos en el Hotel
 * @param npisos 
 */
    void setNpisos(int npisos) {
        this.npisos = npisos;
    }
/**
 * Consigue la cantidad de Pisos en el Hotel
 * @return Entero de Numeros de Pisos en el Hotel
 */
    int getNpisos() {
        return npisos;
    }
/**
 * Consigue ArrayList de Paquetes en el hotel
 * @return ArrayList de Paquetes
 */
    public ArrayList<Paquete> getPaquetes() {
        return paquetes;
    }
/**
 * Setea el ArrayList de Paquetes
 * @param paquetes 
 */
    public void setPaquetes(ArrayList<Paquete> paquetes) {
        this.paquetes = paquetes;
    }
/**
 * Printea en consola
 * una lista de todas las
 * habitaciones disponibles
 */
    void HabitacionesDisponibles() {
        print("Las Habitaciones disponibles son: ");
        habitaciones.forEach((Habitacion habitacion) -> {
            if ((habitacion.IsReserved() || habitacion.IsAvailable()) == false) {
                String s = habitacion.getPiso() + "" + habitacion.getCorrelativo() + ", ";
                System.out.print(s);
            }
        });
    }
/**
 * Desabilita un piso entero
 * @param a = El identificador del piso a desabiltiar
 */
    void DeshabilitarPiso(String a) {
        a = a.toUpperCase();
        for (Habitacion Hab : habitaciones) {
            if (a.equals(Hab.getPiso())) {
                Hab.setIsAvailable(true);
            }

        }
    }
/**
 * Deshabilita una habitacion
 * Recorriendo la lista de habitaciones
 * @param a = Identificador del Piso
 * @param b = Correlativo de Habitacion
 */
    void DeshabilitarHab(String a, int b) {
        a = a.toUpperCase();
        for (Habitacion Hab : habitaciones) {
            if ((a.equals(Hab.getPiso())) && (Hab.getCorrelativo() == b)) {
                Hab.setIsAvailable(true);
            }
        }
    }
/**
 * Habilita un piso previamente desabilitado
 * recibe como parametro un String que es el identificador del Piso
 * a habilitar
 * @param a 
 */
    void HabilitarPiso(String a) {
        a = a.toUpperCase();
        for (Habitacion Hab : habitaciones) {
            if (a.equals(Hab.getPiso())) {
                Hab.setIsAvailable(false);
            }
        }
    }
/**
 * Funcion para Habilitar una Habitacion en especifico
 * Recibe como parametros el identificador del piso y
 * el correlativo de la habitacion
 * @param a
 * @param b 
 */
    void HabilitarHab(String a, int b) {
        a = a.toUpperCase();
        for (Habitacion Hab : habitaciones) {
            if ((a.equals(Hab.getPiso())) && (Hab.getCorrelativo() == b)) {
                Hab.setIsAvailable(false);
                Hab.setIsReserved(false);
            }
        }
    }
/**
 * Setea el precio de una habitacion en especifico
 * Recibe como parametros, el identificador del piso
 * el correlativo de la habitacion y por ultimo
 * recibe el precio a ser establecido en la habitacion
 * @param a
 * @param b
 * @param c 
 */
    void PonerPrecio(String a, int b, double c) {
        a = a.toUpperCase();
        for (Habitacion Hab : habitaciones) {
            if ((a.equals(Hab.getPiso())) && Hab.getCorrelativo() == b) {
                Hab.setCosto(c);
            }
        }
    }
/**
 * Verificar si el dui del cliente se encuentra dentro de la lista de 
 * reservaciones
 * @param dui
 * @return 
 */
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
/**
 * Funcion que se encarga de verificar si una habitacion esta ocupada o libre
 * @param a
 * @param b
 * @return 
 */
    boolean verificarHabitacion(String a, int b) {
        a = a.toUpperCase();
        for (Habitacion Hab : habitaciones) {
            if ((a.equals(Hab.getPiso())) && (Hab.getCorrelativo() == b)) {
                if (!Hab.IsAvailable() && !Hab.IsReserved()) {
                    return true;
                }
            }
        }
        return false;
    }
/**
 * Funcion que se encarga de verificar si una habitacion esta ocupada
 * sino, esta funcion la reserva para el usuario
 * @param a
 * @param b 
 */
    void ReservarHabitacion(String a, int b) {
        a = a.toUpperCase();
        for (Habitacion Hab : habitaciones) {
            if ((a.equals(Hab.getPiso())) && (Hab.getCorrelativo() == b)) {
                Hab.setIsReserved(true);
            }
        }
    }
/**
 * Hace la reservacion al cliente
 * antes verificando que los datos
 * ingresados sean validos para hacer la
 * reservacion
 * @param dui
 * @param a
 * @param b
 * @param p
 * @param dia 
 */
    void HacerReservacion(String dui, String a, int b, Paquete p, int dia) {
        
        a = a.toUpperCase();
        String nom;
        boolean flag = false;
        if (verificarCliente(dui)) {
            if (verificarHabitacion(a, b)) {
                Cliente c = new Cliente(dui);
                print("Ingrese su nombre completo");
                nom = in.nextLine();
                StringTokenizer nombre = new StringTokenizer(nom);
                int cont = 1;
                while(nombre.hasMoreElements()){
                    String n  = nombre.nextElement().toString();
                    if (cont == 1){
                        c.setPrimerNom(n);
                    }
                    if (cont == 2){
                        c.setSegundoNom(n);
                    }
                    if (cont == 3){
                        c.setPrimerApe(n);
                    }
                    if (cont == 4){
                        c.setSegundoApe(n);
                    }
                    cont++;
                }
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
/**
 * Muestra los datos de la reservacion que realizara el cliente, 
 * tambien se encarga de informar si no existen reservaciones
 */
    void MostrarReservacion() {
        if (reservaciones.isEmpty()) {
            System.out.println("No hay reservaciones hechas");
        } else {
            for (Reservacion most : reservaciones) {
                print(most.getCliente().getPrimerNom() + " " + most.getCliente().getSegundoNom() + " " + most.getCliente().getPrimerApe() + " " + most.getCliente().getSegundoApe());

                System.out.println(most.getDias() + " " + most.getHabitacion().getPiso() + most.getHabitacion().getCorrelativo() + " " + most.getCliente().getDui() + " " + most.getPaquete().getNombre());
            }
        }
    }
/**
 * Elimina la reservacion asociada al parametro
 * @param dui 
 */
    void EliminarReservacion(String dui) {
        int cont = 0;
        int index = 0;
        boolean i = false;
        String habP = "";
        int habC = 0;
        for (Reservacion rev : reservaciones) {

            if (dui.equals(rev.getCliente().getDui())) {
                index = cont;
                i = true;
                habP = rev.getHabitacion().getPiso();
                habC = rev.getHabitacion().getCorrelativo();
            }
            cont++;

        }
        if (i) {
            reservaciones.remove(index);
            for (Habitacion hab : habitaciones) {
                if (hab.getPiso().equals(habP) && hab.getCorrelativo() == habC) {
                    HabilitarHab(habP, habC);

                }
            }
        }

    }
/**
 * Funcion para crear paquetes,
 * Verifica que la lista no este vacia, y en caso
 * que si este vacia simplemente la llena, en caso contrario
 * recorre la lista verificando que no se haya ingresado el mismo codigo para 
 * otro paquete
 */
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
/**
 * Funcion para Mostrar la lista completa de paquetes
 */
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
/**
 *  Funcion para retornar un paquete especifico
 * @return 
 */
    Paquete PaqueteS() {
        print("Seleccione el paquete deseado.");
        String n;
        for (int i = 0; getPaquetes().size() > i; i++) {
            n = String.valueOf(i + 1);
            print(n + " " + getPaquetes().get(i).getNombre());
        }
        Scanner leer = new Scanner(System.in);
        int pa;
        pa = leer.nextInt();
        pa = pa - 1;
        return getPaquetes().get(pa);
    }
/**
 *  Funcion para modificar Habitacion
 * 
 * @param pos 
 */
    void ModHabitacion(int pos) {
        int flag = 0;
        String a;
        int c;
        while (flag == 0) {
            System.out.printf("Ingrese el piso de la habitacion a cambiar: ");
            a = in1.nextLine();
            a = a.toUpperCase();
            System.out.printf("Ingrese el correlativo de la habitacion a cambiar: ");
            c = in.nextInt();
            if (verificarHabitacion(a, c)) {
                reservaciones.get(pos).getHabitacion().setPiso(a);
                reservaciones.get(pos).getHabitacion().setCorrelativo(c);
                flag = 1;
            }
            if (flag == 0) {
                System.err.println("La habitacion que ingreso no se encuentra disponible");
            }
        }
    }
/**
 * Funcion para modificar cantidad de dias en una reservacion
 * @param pos 
 */
    void ModDias(int pos) {
        int c = reservaciones.get(pos).ValidarDias();
        reservaciones.get(pos).setDias(c);
    }
/**
 * Funcion para modificar paquete en una reservacion
 * @param pos 
 */
    void ModPaquete(int pos) {
        reservaciones.get(pos).setPaquete(PaqueteS());
    }
       /**
     * Funcion para modificar alguna reservacion
     */
    void ModificarR(){
        System.out.printf("Ingrese DUI: ");
        int flag = 0;
        String dui = null;
        int cont = 0;
        while(flag == 0){
            cont = 0;
            dui = input.nextLine();
            for (Reservacion rev : reservaciones) {
                if (dui.equals(rev.getCliente().getDui())) {
                    flag = 1;
                }
                cont++;
            }
            if (flag == 0){
                System.err.println("El DUI que ingresó no esta registrado");
            }
        }
        print("El que se desea modificar.");
        print("1- Habitacion.");
        print("2- Cantidad de dias.");
        print("3- Paquete.");
        int op = input.nextInt();
        switch (op) {
            case 1:
                ModHabitacion(cont-1);
                break;
            case 2:
                ModDias(cont-1);
                break;
            case 3:
                ModPaquete(cont-1);
                break;
            default:
                print("Ingreso una opcion no valida");
                break;
        }
    }
}
