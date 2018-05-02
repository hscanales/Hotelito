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
    public Menu() {
    }

    public void start() {
        
        boolean flag = true;
        while (flag) {
            deployMain();
            int op = sc.nextInt();
            switch(op){
                case 0:
                    flag=false;
                    break;
                case 1:
                    deployOp1();
                    break;
                case 2:
                    print("Vamos a Realizar una reservacion");
                    break;
                case 3:
                    print("Vamos a Modificar un cliente");
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
    
    void deployOp1(){
        print("Configuracion del Hotel \n Menu \n 1- Desabilitar Piso \n 2- Desabilitar Habitacion \n 3- Definir Precio de Habitacion \n 4- Agregar Piso \n 5- Agregar Habitacion ");
    }

}
