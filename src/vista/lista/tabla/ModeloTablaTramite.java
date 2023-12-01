/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.lista.tabla;

import controlador.TDA.listas.DynamicList;
import controlador.TDA.listas.Exception.EmptyException;
import javax.swing.table.AbstractTableModel;
import modelo.Tramite;

/**
 *
 * @author Usuario iTC
 */
public class ModeloTablaTramite extends AbstractTableModel {

    private DynamicList<Tramite> tramites;

    public DynamicList<Tramite> getTramites() {
        return tramites;
    }

    public void setTramites(DynamicList<Tramite> tramites) {
        this.tramites = tramites;
    }

    @Override
    public int getRowCount() {
        return tramites.getLength();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        try {
            Tramite s = tramites.getInfo(rowIndex);
            switch (columnIndex) {
                case 0:
                    return (s != null) ? s.getNombre(): " ";
                case 1:
                    return (s != null) ? s.getTiempo(): "";
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
            case 0:
                return "Nombre de Tramite";
            case 1:
                return "Tiempo";
            //case 2: return "Duracion";
            default:
                return null;
        }
    }
}
