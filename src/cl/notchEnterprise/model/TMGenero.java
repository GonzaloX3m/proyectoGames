/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.notchEnterprise.model;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.List;

/**
 *
 * @author LAB-315
 */
public class TMGenero implements TableModel{
    private List<Genero> generos;

    public TMGenero(List<Genero> generos) {
        this.generos = generos;
    }
        
    @Override
    public int getRowCount() {
        return generos.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public String getColumnName(int columnIndex) {
        if(columnIndex==0){
            return "ID";
        }else{
            return "Genero";
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Genero g=generos.get(rowIndex);
        if(columnIndex==0){
            return g.getId();
        }else{
            return g.getNombre();
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
    }    
}
