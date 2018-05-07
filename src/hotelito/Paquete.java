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
     * 
     * @param Costo 
     */
    public void setCosto(int Costo) {
        this.Costo = Costo;
    }
    /**
     * 
     * @return Costo 
     */
    public double getCosto() {
        return Costo;
    }
    /**
     * 
     * @return descripcion
     */

    public String getDescripcion() {
        return descripcion;
    }
/**
 * 
 * @param descripcion 
 */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
/**
 * 
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
    

    public Paquete() {
    }
  
}
