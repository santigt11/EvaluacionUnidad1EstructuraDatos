/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import enumeracion.NombreTramite;

/**
 *
 * @author santi
 */
public class Tramite {
    private NombreTramite nombre;
    private Integer tiempo;

    public Tramite(Integer id, NombreTramite nombre, Integer tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public Tramite() {
    }

    public Integer getTiempo() {
        switch (nombre) {
            case CAMBIOCLAVE:
                tiempo = 4;
                break;
            case ACTUALIZACIONDATOS:
                tiempo = 7;
                break;
            case ASIGNACIONAFILIADO:
                tiempo = 15;
                break;
            case RECUPERACIONCLAVE:
                tiempo = 3;
                break;
            default:
                throw new AssertionError();
        }
        return tiempo;
    }

    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
    }

    public NombreTramite getNombre() {
        return nombre;
    }

    public void setNombre(NombreTramite nombre) {
        this.nombre = nombre;
    }
}
