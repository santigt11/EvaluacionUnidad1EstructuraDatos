package controlador;

import controlador.TDA.listas.DynamicList;
import controlador.TDA.listas.Exception.EmptyException;
import modelo.Persona;
import modelo.Simulacion;

public class SimulacionControl {

    private Simulacion simulacion = new Simulacion();
    private DynamicList<Simulacion> simulaciones;

    public SimulacionControl(Simulacion simulacion) {
        this.simulacion = simulacion;
    }

    public SimulacionControl() {
        this.simulaciones = new DynamicList<>();
    }

    //Metodo que permite guardar
    public Boolean guardar() {
        try {
            getSimulacion().setId(getSimulaciones().getLength());
            getSimulaciones().add(getSimulacion());
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Integer posVerificar() throws EmptyException {

        Integer bandera = 0;

        for (Integer i = 0; i <= this.simulaciones.getLength(); i++) {

            if (this.getSimulaciones().getInfo(i) == null) {
                bandera = i;
                break;
            }
        }
        return bandera;
    }

    public void imprimir() throws EmptyException {
        for (int i = 0; i < this.getSimulaciones().getLength(); i++) {
            System.out.println(getSimulaciones().getInfo(i));
        }
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

    public DynamicList<Simulacion> getSimulaciones() {
        return simulaciones;
    }

    public void setSimulaciones(DynamicList<Simulacion> simulaciones) {
        this.simulaciones = simulaciones;
    }
}
