/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.lista.tabla;

import controlador.TDA.listas.DynamicList;
import controlador.TDA.listas.Exception.EmptyException;
import javax.swing.table.AbstractTableModel;
import modelo.Simulacion;

/**
 *
 * @author Usuario iTC
 */
public class ModeloTablaSimulacion extends AbstractTableModel{
        private DynamicList<Simulacion> simulaciones;

        public DynamicList<Simulacion> getSimulaciones() {
                return simulaciones;
        }

        public void setSimulaciones(DynamicList<Simulacion> simulaciones) {
                this.simulaciones = simulaciones;
        }
   
        @Override
        public int getRowCount() {
                return simulaciones.getLength();
        }

        @Override
        public int getColumnCount() {
                return 2;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
                try {
                        Simulacion s = simulaciones.getInfo(rowIndex);
                        switch (columnIndex) {
                                case 0: return (s != null) ? s.getId(): " ";
                                case 1: return (s != null) ? s.getNombre(): "";
                                //case 2: return (s != null) ? : "";
                                default:
                                        return null;
                                }
                        } catch (EmptyException ex) {
                return null;
                }
        }

        
        @Override
        public String getColumnName(int column) {
                switch (column) {
                        case 0: return "Numero de cliente";
                        case 1: return "Tipo de tramite";
                        //case 2: return "Duracion";
                        default:
                                return null;
                }
        }
}
