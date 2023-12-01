package controlador.Archivos;

import controlador.DAO.DaoImplement;
import controlador.TDA.listas.DynamicList;
import modelo.Ventanilla;

public class VentanillaControl extends DaoImplement<Ventanilla>{
        private Ventanilla ventanilla;
        private DynamicList<Ventanilla> ventanillas;

        public VentanillaControl(Class<Ventanilla> clazz) {
                super(clazz);
        }

        public Ventanilla getVentanilla() {
                return ventanilla;
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

        /*public Boolean persist(){
                
        }*/
        
}
