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
 * @author Emilio
 */
public class TMJuego implements TableModel{
    private List<Juego> juegos;

    public TMJuego(List<Juego> juegos) {
        this.juegos = juegos;
    }

    @Override
    public int getRowCount() {
        return juegos.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int columnIndex) {
        if(columnIndex==0){
            return "ID";
        }else if(columnIndex==1){
            return "Nombre";
        }else if(columnIndex==2){
            return "Stock";
        }else if(columnIndex==3){
            return "Precio";
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
        Juego j=juegos.get(rowIndex);
        if(columnIndex==0){
            return j.getId();
        }else if(columnIndex==1){
            return j.getNombre();
        }else if(columnIndex==2){
            return j.getStock();
        }else if(columnIndex==3){
            return j.getPrecio();
        }else{
            return j.getGenero();
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
