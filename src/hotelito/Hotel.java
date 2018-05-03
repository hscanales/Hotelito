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
    private int npisos = 6;

    public Hotel() {
        String[] pisos = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        ArrayList<String> hab;
        hab = new ArrayList<>();
        for (int i = 1; i <= npisos; i++) {
            for (int j = 1; j <= 10; j++) {
                String n = String.valueOf(j);
                if (i % 2 == 0) {
                    habitaciones.add(new Habitacion("Double", 150, j, pisos[i - 1], false, false));
                } else {
                    habitaciones.add(new Habitacion("Single", 125, j, pisos[i - 1], false, false));
                }
                hab.add(pisos[i - 1] + n);
            }
        }
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
                Hab.setIsReserved(true);
            }
        }
    }

    void HacerReservacion(String dui, String a, int b) {
        //HabitacionesDisponibles();
        boolean flag = false;
        if (verificarCliente(dui)) {
            System.out.print("PASASTE VERIFICAR CLIENTE");
            if (verificarHabitacion(a, b)) {
                System.out.print("PASASTE Habitacion");
                Cliente c = new Cliente(dui);
                Paquete p = new Paquete();
                ReservarHabitacion(a, b);

                for (Habitacion Hab : habitaciones) {
                    if ((a.equals(Hab.getPiso())) && (Hab.getCorrelativo() == b)) {
                        System.out.print("TSUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
                        Reservacion v = new Reservacion(6, Hab, p, c);
                        reservaciones.add(v);
                        flag = true;
                    }
                }

            }
        }
        if (!flag) {
            System.out.println("no se hizo la reservacion ");
        }

    }

    void EleminarReservacion(String dui) {
        int cont = 0;
        for (Reservacion rev : reservaciones) {
            cont++;

            if (dui.equals(rev.getCliente().getDui())) {
                reservaciones.remove(cont);
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
