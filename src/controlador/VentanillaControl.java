package controlador;

import controlador.TDA.listas.DynamicList;

public class VentanillaControl {
        private VentanillaControl ventanilla;
        private DynamicList<VentanillaControl> ventanillas;

        public VentanillaControl() {
        }

        public VentanillaControl(VentanillaControl ventanilla, DynamicList<VentanillaControl> ventanillas) {
                this.ventanilla = ventanilla;
                this.ventanillas = ventanillas;
        }

        public VentanillaControl getVentanilla() {
                return ventanilla;
        }

        public void setVentanilla(VentanillaControl ventanilla) {
                this.ventanilla = ventanilla;
        }

        public DynamicList<VentanillaControl> getVentanillas() {
                return ventanillas;
        }

        public void setVentanillas(DynamicList<VentanillaControl> ventanillas) {
                this.ventanillas = ventanillas;
        }
}
