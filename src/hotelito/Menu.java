package hotelito;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Clase Menu, es el Administrador de el programa en general, Utiliza Patron
 * Singleton
 *
 * @author HsCanales <00136317@uca.edu.sv>,
 */
public class Menu extends Auxiliar {

    private static Menu menu;

    Scanner sc = new Scanner(System.in);

    Scanner sc1 = new Scanner(System.in);

    Scanner sc2 = new Scanner(System.in);

    Hotel hotel = new Hotel();

    /**
     * Constructor Menu
     */
    private Menu() {
    }

    /**
     * Hace un instancia del objeto menu dentro de la memoria
     *
     * @return
     */
    public static Menu getInstance() {
        if (menu == null) {
            menu = new Menu();
        }
        return menu;
    }

    /**
     * Inicia el Programa con el Menu Principal, Printeando las opciones para
     * los menu secundarios.
     */
    public void start() {
        int op = 0;
        boolean flag = true;
        while (flag) {
            deployMain();
            while (true){
                try{
                    Scanner n = new Scanner(System.in);
                    op = n.nextInt();
                    break;
                } 
                catch(Exception e){
                    System.err.println("Lo que ingreso no es un numero");
                }
            }
            switch (op) {
                case 0:
                    flag = false;
                    break;
                case 1:
                    deployOp1();

                    break;
                case 2:
                    print("Vamos a Realizar una reservacion");
                    deployOp2();
                    break;
                case 3:
                    print("Vamos a Modificar un cliente");
                    deployOp3();
                    break;
                default:
                    System.err.println("Ingreso una opcion no valida, intente denuevo");
                    break;
            }
        }
    }

    /**
     * Muestra el Menu principal. El menu se encarga de desplegar dos opciones
     * al usuario de poder configurar algunos aspectos del hotel y poder 
     * configurar las reservaciones
     */
    void deployMain() {
        print("Hotelito v0.01");
        print("Menu: ");
        print("0- Salir");
        print("1- Configurar Hotel");
        print("2- Reservaciones");
        print("3- Clientes");
        print("Ingrese su opcion: ");
    }

    /**
     * Primer Menu Secundario. Menu encargado modificar el estado y precio de 
     * las habitaciones y poder agregar o eliminar paquetes ofrecidos por el 
     * hotel
     */
    void deployOp1() {
        boolean flag = true;
        boolean flag1 = true; 
        int op = 0;
        while (flag) {
            print("Configuracion del Hotel \n");
            print("Menu");
            print("0- Regresar.");
            print("1- Desabilitar Piso.");
            print("2- Desabilitar Habitacion.");
            print("3- Habilitar Piso.");
            print("4- Habilitar Habitacion.");
            print("5- Definir Precio de Habitacion.");
            print("6- Agregar Paquete.");
            print("7- Mostrar paquetes actuales:");
            print("Ingrese su opcion: ");
            while (true){
                try{
                    Scanner n = new Scanner(System.in);
                    op = n.nextInt();
                    break;
                } 
                catch(Exception e){
                    System.err.println("Lo que ingreso no es un numero");
                }
            }
            switch (op) {
                case 0:
                    flag = false;
                    break;
                case 1:
                    String s = null;
                    int n;
                    flag1 = true;
                    print("Ingrese la letra del piso a deshabilitar");
                    while(flag1){
                        s = sc1.nextLine();
                        try{
                            n = Integer.parseInt(s);
                            System.err.println("Debe ingresar una letra.");
                        }
                        catch(Exception e){
                            flag1 = false;
                        }
                    }
                    hotel.DeshabilitarPiso(s);
                    print("");
                    break;
                case 2:
                    while (true){
                        System.out.print("Ingrese el piso de la habitacion a deshabilitar: ");
                        String s2 = sc1.nextLine();
                        System.out.print("Ingrese el correlativo de la habitacion a deshabilitar: ");
                        int r = sc.nextInt();
                        if (hotel.verificarHabitacion(s2, r)){
                            hotel.DeshabilitarHab(s2, r);
                            break;
                        }
                        System.err.println("Ingreso una habitación no existente");
                    }
                    print("");
                    break;
                case 3:
                    String s3 = null;
                    int n1;
                    flag1 = true;
                    print("Ingrese Letra del piso a habilitar: ");
                    while(flag1){
                        s3 = sc1.nextLine();
                        try{
                            n1 = Integer.parseInt(s3);
                            System.err.println("Debe ingresar una letra.");
                        }
                        catch(Exception e){
                            flag1 = false;
                        }
                    }
                    hotel.HabilitarPiso(s3);
                    print("");
                    break;
                case 4:
                    while (true){
                        System.out.print("Ingrese el piso de la habitacion a habilitar: ");
                        String s4 = sc1.nextLine();
                        System.out.print("Ingrese el correlativo de la habitacion a habilitar: ");
                        int r2 = sc.nextInt();
                        if (hotel.verificarHabitacion(s4, r2)){
                            hotel.HabilitarHab(s4, r2);
                            break;
                        }
                        System.err.println("Ingreso una habitación no existente");
                    }
                    print("");
                    break;
                case 5:
                    while (true){
                        System.out.print("Ingrese el piso de la habitacion: ");
                        String s5 = sc1.nextLine();
                        System.out.print("Ingrese el correlativo de la habitacion: ");
                        int r3 = sc.nextInt();
                        if (hotel.verificarHabitacion(s5, r3)){
                            print("Ingrese el costo de la habitacion: ");
                            double c = sc.nextDouble();
                            hotel.PonerPrecio(s5, r3, c);
                            break;
                        }
                        System.err.println("Ingreso una habitación no existente");
                    }
                    break;

                case 6:
                    hotel.CrearPaquete();
                    break;
                case 7:
                    hotel.MostrarPaquetes();
                    break;
                default:
                    System.err.println("Ingreso una opcion no valida, intente denuevo");
                    break;
            }

        }
    }

    /**
     * Segundo Menu Secundario. La funcion es mostrar todas las opciones que 
     * reservaciones tiene para mostrarle al usuario.
     */
    void deployOp2() {
        boolean flag = true;
        int op = 0;
        while (flag) {
            print("Reservaciones: "); 
            print("Menu");
            print("0- Regresar,");
            print("1- Hacer Reservacion.");
            print("2- Eliminar Reservacion.");
            print("3- Habitaciones Disponibles.");
            print("4- Mostrar Reservaciones");
            print("5- Modificar Reservacion");
            print("Ingrese su opcion: ");
            while (true){
                try{
                    Scanner n = new Scanner(System.in);
                    op = n.nextInt();
                    break;
                } 
                catch(Exception e){
                    System.err.println("Lo que ingreso no es un numero");
                }
            }
            switch (op) {
                case 0:
                    flag = false;
                    break;
                case 1:
                    print("Ingrese los siguientes datos");
                    System.out.printf("DUI: ");
                    String dui = sc1.nextLine();
                    print("Habitación");
                    System.out.printf("Piso: ");
                    String habb = sc2.nextLine();
                    System.out.printf("Correlativo: ");
                    int haba = sc.nextInt();
                    Reservacion re = new Reservacion();
                    int dias = re.ValidarDias();
                    hotel.HacerReservacion(dui, habb, haba, hotel.PaqueteS(), dias);
                    break;
                case 2:
                    print("Ingrese el dui del cliente para eliminar la reservacion: ");
                    String s2 = sc1.nextLine();
                    hotel.EliminarReservacion(s2);
                    break;
                case 3:
                    print("Habitacines Disponibles");
                    hotel.HabitacionesDisponibles();
                    print("");
                    print("");
                    break;
                    
                case 4:
                    print("Mostrar reservaciones");
                    hotel.MostrarReservacion();
                    break;
                case 5:
                    if (hotel.reservaciones.size() == 0){
                        System.err.println("No se han hecho reservaciones");
                    }
                    else{
                        hotel.ModificarR();
                    }
                    break;
                default:
                    System.err.println("Ingreso una opcion no valida");
                    break;
            }
        }
    }   

    /**
     * Tercer Menu Secundario. ESte menu se 
     */
    void deployOp3() {
        int op = 0;
        boolean flag = true;
        while (flag) {
            print("Reservaciones: ");
            print("Menu");
            print("1- Modificar Cliente");
            print("Ingrese su opcion: ");
            while (true){
                try{
                    Scanner n = new Scanner(System.in);
                    op = n.nextInt();
                    break;
                } 
                catch(Exception e){
                    System.err.println("Lo que ingreso no es un numero");
                }
            }
            switch (op) {
                case 0:
                    flag = false;
                    break;
                case 1:
                    print("Modificando al cliente");

                    break;
                default:
                    System.err.println("Ingreso una opcion no valida, intente denuevo");
                    break;
            }
        }

    }

}
