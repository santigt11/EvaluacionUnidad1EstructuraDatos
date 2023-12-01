/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author santi
 */
public class Ventanilla {
    private Integer id;
    private Integer nroPersonasAten;
    private Integer tiempoTotal;
    private Tramite tramite;

    public Ventanilla(Integer id, Integer nroPersonasAten, Tramite tramite) {
        this.id = id;
        this.nroPersonasAten = nroPersonasAten;
        this.tramite = tramite;
    }

    public Ventanilla() {
    }

    public Integer getTiempoTotal() {
        return tiempoTotal;
    }

    public void setTiempoTotal(Integer tiempoTotal) {
        this.tiempoTotal = tiempoTotal;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNroPersonasAten() {
        return nroPersonasAten;
    }

    public void setNroPersonasAten(Integer nroPersonasAten) {
        this.nroPersonasAten = nroPersonasAten;
    }

    public Tramite getTramite() {
            if (tramite == null) {
                    tramite = new Tramite();
            }
            return tramite;
    }

    public void setTramite(Tramite tramite) {
        this.tramite = tramite;
    }
}
