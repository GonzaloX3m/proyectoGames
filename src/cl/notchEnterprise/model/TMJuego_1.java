/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.notchEnterprise.model;

import java.sql.SQLException;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Emilio
 */
public class TMJuego_1 implements TableModel{
    private List<Juego> juegos;
    private Data d;

    public TMJuego_1(List<Juego> juegos) throws SQLException{
        this.juegos = juegos;
        d= new Data();
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
        Juego j = juegos.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return j.getId();
            case 1:
                return j.getNombre();
            case 2:
                return j.getStock();
            case 3:
                return j.getPrecio();
            case 4: {
                int idGenero = j.getGenero();
                
                try {
                    Genero g = d.getGenero(idGenero);
                    System.out.println(g.getNombre());
                    return g.getNombre();
                } catch (SQLException ex) {
                    Logger.getLogger(TMJuego_1.class.getName()).log(Level.SEVERE, null, ex);
                    return null;
                }
            }
        }        
        return null;
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
