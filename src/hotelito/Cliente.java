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
import java.util.Scanner;

public class Cliente {
    private Reservacion res;
    private String nombre, tarcre, dui;
    private float costo, coston;
    
    public Cliente (){}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTarcre(String tarcre) {
        this.tarcre = tarcre;
    }
    public void setDui(String dui) {
        this.dui = dui;
    }
    public void setCosto(float costo) {
        this.costo = costo;
    }
    public void setCoston(float coston) {
        this.coston = coston;
    }

    public String getNombre() {
        return nombre;
    }
    public String getTarcre() {
        return tarcre;
    }
    public String getDui() {
        return dui;
    }
    public float getCosto() {
        return costo;
    }
    public float getCoston() {
        return coston;
    }
    
    public void ValidarTarCre(){
        int flag = 1;
        while(flag == 1){
            String tarjeta;
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese su tarjeta de crédito: ");
            tarjeta = leer.next();
            
            if (12 == tarjeta.length()){
                setTarcre(tarjeta);
                flag = 0;
            }
            else{
                System.err.println("La tarjeta de crédito que ingreso no es valida");
            }
        }
    }
    
    /*public void ValidarNumDia(){
        int flag = 1;
        while(flag == 1){
            int dia;
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese la cantidad de dias");
            dia = leer.nextInt();
            
            if (dia <= 7){
                setNumdia(dia);
                flag = 0;
            }
            else{
                System.err.println("La cantidad de dias que ingreso es mayor que el limite ");
            }
        }
    }*/
    public void validarDui(String dui){
        int cont = 9;
        int auxiliar, total = 0;
        for(int i=0;i<dui.length()-1;i++){
            auxiliar= Integer.parseInt(String.valueOf(dui.charAt(i)))*cont;
            total += auxiliar;
            System.out.println(auxiliar);
            cont=cont-1;
        }
        auxiliar = Integer.parseInt(String.valueOf(dui.charAt(8)));
        System.out.println(10-(total%10));      
    }
}
