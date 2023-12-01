/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author santi
 */
public class Simulacion {
    private Integer id;
    private String nombre;
    private Ventanilla ventanilla1;
    private Ventanilla ventanilla2;
    private Ventanilla ventanilla3;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ventanilla getVentanilla1() {
        if(ventanilla1 == null){
                ventanilla1 = new Ventanilla();
        }
            return ventanilla1;
    }

    public void setVentanilla1(Ventanilla ventanilla1) {
        this.ventanilla1 = ventanilla1;
    }

    public Ventanilla getVentanilla2() {
        if(ventanilla2 == null){
                ventanilla2 = new Ventanilla();
        }
            return ventanilla2;
    }

    public void setVentanilla2(Ventanilla ventanilla2) {
        this.ventanilla2 = ventanilla2;
    }
    
    
    public Ventanilla getVentanilla3() {
        if(ventanilla3 == null){
                ventanilla3 = new Ventanilla();
        }
            return ventanilla3;
    }

    public void setVentanilla3(Ventanilla ventanilla3) {
        this.ventanilla3 = ventanilla3;
    }
}
