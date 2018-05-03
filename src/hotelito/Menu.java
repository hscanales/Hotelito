/*
 * 
 * 
 * 
 */
package hotelito;

import java.util.Scanner;

/**
 *
 * @author HsCanales <00136317@uca.edu.sv>
 */
public class Menu extends Auxiliar {

    Scanner sc = new Scanner(System.in);

    Scanner sc1 = new Scanner(System.in);

    Scanner sc2 = new Scanner(System.in);

    Hotel hotel = new Hotel();

    public Menu() {
    }

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

    void deployMain() {
        print("Hotelito v0.01");
        print("Menu: ");
        print("0- Salir");
        print("1- Configurar Hotel");
        print("2- Reservaciones");
        print("3- Clientes");
        print("Ingrese su opcion: ");

    }

    void deployOp1() {
        boolean flag = true;
        while (flag) {
            print("Configuracion del Hotel \n Menu \n 0- Regresar \n 1- Desabilitar Piso \n 2- Desabilitar Habitacion \n 3- Definir Precio de Habitacion \n 4- Agregar Piso \n 5- Agregar Habitacion \n 6- Agregar Paquete \n 7- Mostrar paquetes actuales: \n Ingrese su opcion: ");
            int op = sc.nextInt();
            switch (op) {
                case 0:
                    flag = false;
                    break;
                case 1:
                    print("Ingrese Letra del piso a desabilitar: ");
                    String s = sc1.nextLine();

                    hotel.DeshabilitarPiso(s);
                    break;
                case 2:
                    print("Ingrese Letra de la habitacion a desabilitar: ");
                    String s2 = sc1.nextLine();
                    print("Ingrese Correlativo de la habitacion a desabilitar: ");
                    int r = sc.nextInt();
                    hotel.DeshabilitarHab(s2, r);
                    break;
                    
                case 3:
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

    void deployOp2() {
        boolean flag = true;
        while (flag) {
            print("Reservaciones \n Menu \n 1- Hacer Reservacion \n 2- Eliminar Reservacion \n 3- Habitaciones Disponibles \n 4- Agregar Piso \n 5- Agregar Habitacion \n Ingrese su opcion: ");
            int op = sc.nextInt();
            switch (op) {
                case 0:
                    flag = false;
                    break;
                case 1:

                    print("Ingrese el DUI del cliente y La habitacion deseeada");
                    String dui = sc1.nextLine();
                    String habb = sc2.nextLine();
                    int haba = sc.nextInt();

                    hotel.HacerReservacion(dui, habb, haba);
                    break;
                case 2:

                    print("Ingrese Letra de la habitacion a desabilitar: ");
                    String s2 = sc1.nextLine();
                    print("Ingrese Correlativo de la habitacion a desabilitar: ");
                    int r = sc.nextInt();
                    hotel.DeshabilitarHab(s2, r);
                    break;
                case 3:

                    print("Habitacines Disponibles");
                    hotel.HabitacionesDisponibles();
                    break;
                default:
                    print("Ingreso una opcion no valida");
                    break;
            }

        }
    }
    
    void deployOp3(){
        
    }
}
