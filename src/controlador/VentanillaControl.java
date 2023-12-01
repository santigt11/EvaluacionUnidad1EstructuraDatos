package controlador;

import controlador.TDA.listas.DynamicList;
import modelo.Ventanilla;

public class VentanillaControl {
        private Ventanilla ventanilla = new Ventanilla();
        private DynamicList<Ventanilla> ventanillas;

        public VentanillaControl() {
        }

        public VentanillaControl(DynamicList<Ventanilla> ventanillas) {
                this.ventanillas = ventanillas;
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

        public DynamicList<Ventanilla> getVentanillas() {
                return ventanillas;
        }

        public void setVentanillas(DynamicList<Ventanilla> ventanillas) {
                this.ventanillas = ventanillas;
        }
        
        public Boolean guardar(){
                try {
                        getVentanillas().add(getVentanilla());
                        return true;
                } catch (Exception e) {
                        return false;
                }
        }
}
