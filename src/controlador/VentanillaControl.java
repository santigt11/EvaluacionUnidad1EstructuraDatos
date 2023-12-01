package controlador;

import controlador.TDA.listas.DynamicList;
import controlador.TDA.listas.Exception.EmptyException;
import modelo.Ventanilla;

public class VentanillaControl {
        private Ventanilla ventanilla = new Ventanilla();
        private DynamicList<Ventanilla> ventanillas;

        public VentanillaControl() {
        }

        public Ventanilla getVentanilla() {
                if (ventanilla == null) {
                        ventanilla = new Ventanilla();
                }
                return ventanilla;
        }

        public void setVentanilla(DynamicList<Ventanilla> ventanilla) {
                this.ventanillas = ventanillas;
        }

        public VentanillaControl(DynamicList<Ventanilla> ventanillas) {
                this.ventanillas = ventanillas;
        }
   
        
         //Metodo que permite guardar
    public Boolean guardar() {
        try {
            getVentanilla().setId(getVentanillas().getLength());
            getVentanillas().add(getVentanilla());
            return true;
        } catch (Exception e) {
            return false;
        }
    }
        
    public Integer posVerificar() throws EmptyException {

        Integer bandera = 0;

        for (Integer i = 0; i <= this.ventanillas.getLength(); i++) {

            if (this.getVentanillas().getInfo(i) == null) {
                bandera = i;
                break;
            }
        }
        return bandera;
    }

    public void imprimir() throws EmptyException {
        for (int i = 0; i < this.getVentanillas().getLength(); i++) {
            System.out.println(getVentanillas().getInfo(i));
        }
    }

    public void setVentanilla(Ventanilla ventanilla) {
        this.ventanilla = ventanilla;
    }

    public DynamicList<Ventanilla> getVentanillas() {
        return ventanillas;
    }

    public void setVentanillas(DynamicList<Ventanilla> ventanillas) {
        this.ventanillas = ventanillas;
    }
//        public Integer calcularTiempo(){
//        switch (getVentanilla().getTramite().getNombre()) {
//            case "cambioClave":
//                getVentanilla().getTramite().setTiempo(4);
//            case "actualizacionDatos":
//                getVentanilla().getTramite().setTiempo(7);
//            case "asignacionAfiliados":
//                getVentanilla().getTramite().setTiempo(15);
//            default:
//                throw new AssertionError();
//        }
//        Integer tiempoTotal = (getVentanilla().getTramite().getTiempo());
//        return  tiempoTotal;
//    }
}
