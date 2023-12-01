/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import controlador.TDA.listas.DynamicList;

/**
 *
 * @author santi
 */
public class Ventanilla {
    private Integer id;
    private Integer nroPersonasAten;
    private Integer tiempoTotal;
    private DynamicList<Tramite> tramites;

    public Ventanilla(Integer id, Integer nroPersonasAten, Integer tiempoTotal, DynamicList<Tramite> tramites) {
        this.id = id;
        this.nroPersonasAten = nroPersonasAten;
        this.tiempoTotal = tiempoTotal;
        this.tramites = tramites;
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

    public DynamicList<Tramite> getTramites() {
            if (tramites == null) {
                    tramites = new DynamicList<>();
            }
            return tramites;
    }

    public void setTramites(DynamicList<Tramite> tramites) {
        this.tramites = tramites;
    }
}
