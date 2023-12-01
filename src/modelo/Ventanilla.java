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

        public Ventanilla() {
        }

        public Ventanilla(Integer id, Integer nroPersonasAten) {
                this.id = id;
                this.nroPersonasAten = nroPersonasAten;
        }
    private Tramite tramite;
    
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
        return tramite;
    }

    public void setTramite(Tramite tramite) {
        this.tramite = tramite;
    }
}
