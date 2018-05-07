package hotelito;

/**
 * Objeto Paquete de Hotel, 
 * Utilizado para brindarle servicios al usuario
 * @author nitroskate, Hscanales<00136317@uca.edu.sv>
 */
public class Paquete {
    private double Costo;
    private String descripcion,nombre,codigo;
    
    /**
     * Setter de la clase Paquete
     * Atributo de Costo
     * @param Costo 
     */
    public void setCosto(int Costo) {
        this.Costo = Costo;
    }
    /**
     * Getter de la Clase Paquete
     * Atributo de Costo
     * @return Costo 
     */
    public double getCosto() {
        return Costo;
    }
    /**
     * Getter de la clase Paquete
     * Atributo de descripcion
     * @return descripcion
     */

    public String getDescripcion() {
        return descripcion;
    }
/**
 * Setter de la clase Paquete
 * Atributo de Descripcion
 * @param descripcion 
 */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
/**
 * Getter de la Clase paquete
 * Atributo de Nombre
 * @return nombre 
 */
    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @param nombre 
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCodigo() {
        return codigo;
    }
/**
 * 
 * @param codigo 
 */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
/**
 * Constructor de la clase paquete
 * @param Costo
 * @param descripcion
 * @param nombre
 * @param codigo 
 */
    public Paquete(double Costo, String descripcion, String nombre, String codigo) {
        this.Costo = Costo;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.codigo = codigo;
    }
    
/**
 * Constructor publico de Paquete
 * Instancia el paquete sin llenar ningun dato
 */
    public Paquete() {
    }
  
}
