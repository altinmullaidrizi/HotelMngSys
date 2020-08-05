/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

import BLL.Room;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Ilmi
 */
public class RoomTableModel extends AbstractTableModel{
    
    List<Room> list;
    String [] cols = {"No.", "RoomNo" , "Capacity", "Wi-Fi", "TV", "Person"};
    
    public RoomTableModel(){}
    
    public RoomTableModel(List<Room> list){
        this.list = list;
    }
    
    public void addList(List<Room> list){
        this.list = list;
    }
    
    @Override
    public String getColumnName(int col){
        return cols[col];
    }
    
    public void remove(int row){
        list.remove(row);
    }
    
    public Room getRoom(int index){
        return list.get(index);
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Room v = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return v.getId();
            case 1:
                return v.getRoomNo();
            case 2:
                return v.getCapacity();
            case 3:
                return v.getHasWifi();
            case 4:
                return v.getHasTV();
            case 5:
                return v.getPersonID();
            default:
                return null;
        }
    }
    
}
