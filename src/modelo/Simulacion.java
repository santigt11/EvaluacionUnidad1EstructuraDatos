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
    private Integer totalAtendido;
    private Integer personasTotal;

    public Simulacion(Integer id, String nombre, Ventanilla ventanilla1, Ventanilla ventanilla2, Ventanilla ventanilla3) {
        this.id = id;
        this.nombre = nombre;
        this.ventanilla1 = ventanilla1;
        this.ventanilla2 = ventanilla2;
        this.ventanilla3 = ventanilla3;
    }

    public Integer getTotalAtendido() {
        return ventanilla1.getTiempoTotal() + ventanilla2.getTiempoTotal() + ventanilla3.getTiempoTotal();
    }

    public void setTotalAtendido(Integer totalAtendido) {
        this.totalAtendido = totalAtendido;
    }

    public Integer getPersonasTotal() {
        return personasTotal;
    }

    public void setPersonasTotal(Integer personasTotal) {
        this.personasTotal = personasTotal;
    }

    public Simulacion() {
    }
    
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
        return ventanilla1;
    }

    public void setVentanilla1(Ventanilla ventanilla1) {
        this.ventanilla1 = ventanilla1;
    }

    public Ventanilla getVentanilla2() {
        return ventanilla2;
    }

    public void setVentanilla2(Ventanilla ventanilla2) {
        this.ventanilla2 = ventanilla2;
    }

    public Ventanilla getVentanilla3() {
        return ventanilla3;
    }

    public void setVentanilla3(Ventanilla ventanilla3) {
        this.ventanilla3 = ventanilla3;
    }
}
