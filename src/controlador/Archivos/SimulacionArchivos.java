/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.Archivos;

import controlador.DAO.DaoImplement;
import controlador.TDA.listas.DynamicList;
import modelo.Simulacion;

/**
 *
 * @author santi
 */
public class SimulacionArchivos extends DaoImplement<Simulacion>{
    private DynamicList<Simulacion> simulaciones;
    private Simulacion simulacion;

    public SimulacionArchivos() {
        super(Simulacion.class);
    }

    public DynamicList<Simulacion> getSimulaciones() {
        simulaciones = all();
        return simulaciones;
    }

    public void setSimulaciones(DynamicList<Simulacion> vendedores) {
        this.simulaciones = vendedores;
    }

        public Simulacion getSimulacion() {
        if (simulacion == null) {
            simulacion = new Simulacion();
        }
        return simulacion;
    }

    public void setSimulacion(Simulacion simulacion) {
        this.simulacion = simulacion;
    }
    
    public Boolean persist(){
        simulacion.setId(all().getLength() + 1);
        return persist(simulacion);
    }
}
