
package hotelito;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *Clase Menu, es el Administrador de el programa en general, Utiliza Patron Singleton
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
     * Instancea a Menu en la memoria
     * @return 
     */
    public static Menu getInstance(){
        if(menu==null){
            menu=new Menu();
        }      
        return menu;
    }
    
    /**
     * Inicia el Programa con el Menu Principal, Printeando las opciones para los menu secundarios
     */
    public void start() {

        boolean flag = true;
        while (flag) {
            deployMain();
            int op = sc.nextInt();
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
                    print("No a ingresado una opcion valida intente de nuevo");
                    break;
            }
        }

    }
/**
 * Printea el Menu principal
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
 * Primer Menu Secundario
 */
    void deployOp1() {
        boolean flag = true;
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
            int op = sc.nextInt();
            switch (op) {
                case 0:
                    flag = false;
                    break;
                case 1:
                    try{
                    print("Ingrese Letra del piso a desabilitar: ");
                    String s = sc1.nextLine();

                    hotel.DeshabilitarPiso(s);
                    break;}
                    catch(Exception e){
                        System.out.println("Ha ocurrido un error al ingresar el piso, intente en Mayusculas denuevo");
                    }
                case 2:
                    print("Ingrese Letra de la habitacion a desabilitar: ");
                    String s2 = sc1.nextLine();
                    print("Ingrese Correlativo de la habitacion a desabilitar: ");
                    int r = sc.nextInt();
                    hotel.DeshabilitarHab(s2, r);
                    break;
                case 3:
                    print("Ingrese Letra del piso a habilitar: ");
                    String s3 = sc1.nextLine();

                    hotel.HabilitarPiso(s3);
                    break;
                case 4:
                    print("Ingrese Letra de la habitacion a habilitar: ");
                    String s4 = sc1.nextLine();
                    print("Ingrese Correlativo de la habitacion a habilitar: ");
                    int r2 = sc.nextInt();
                    hotel.HabilitarHab(s4, r2);
                    break;
                    
                case 5:
                    print("Ingrese la letra de la habitacion para poner el costo: ");
                    String l = sc1.nextLine();
                    print("Ingrese el correlativo de la habitacion para poner el costo: ");
                    int l2 = sc.nextInt();
                    print("Ingrese el costo de la habitacion: ");
                    double c = sc.nextDouble();
                    hotel.PonerPrecio(l, l2, c);
                     break;
                            
                case 6:
                    hotel.CrearPaquete();
                    break;
                case 7:
                    hotel.MostrarPaquetes();
                    break;
                default:
                    print("Ingreso una opcion no valida");
                    break;
            }

        }
    }
/**
 * Segundo Menu Secundario
 */
    void deployOp2() {
        boolean flag = true;
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
            int op = sc.nextInt();
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
                    print("Ingreso una opcion no valida");
                    break;
            }
        }
    }   
    
    /**
     * Tercer Menu Secundario
     */
    void deployOp3(){
        boolean flag = true;
        while (flag) {
            print("Reservaciones: "); 
            print("Menu");
            print("1- Modificar Cliente");
            print("Ingrese su opcion: ");
            int op = sc.nextInt();
            switch (op) {
                case 0:
                    flag = false;
                    break;
                case 1:
                    print("Modificando al cliente");
                    
                    break;
                default:
                    print("Ingreso una opcion no valida");
                    break;
            }
        }
        
    }
 
}
