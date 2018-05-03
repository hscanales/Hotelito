/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelito;

/**
 *
 * @author nitroskate
 */
public class Paquete {
    private double Costo;
    private String descripcion,nombre,codigo;
    
    public void setCosto(int Costo) {
        this.Costo = Costo;
    }
    
    public double getCosto() {
        return Costo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Paquete(double Costo, String descripcion, String nombre, String codigo) {
        this.Costo = Costo;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.codigo = codigo;
    }
    

    public Paquete() {
    }
  
}
