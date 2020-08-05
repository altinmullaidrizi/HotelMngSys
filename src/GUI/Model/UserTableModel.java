/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

import BLL.Useri;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Ilmi
 */
public class UserTableModel extends AbstractTableModel{
    
    List<Useri> list;
    String [] cols = {"ID", "Username" , "Role"};
    
    public UserTableModel(){}
    
    public UserTableModel(List<Useri> list){
        this.list = list;
    }
    
    public void addList(List<Useri> list){
        this.list = list;
    }
    
    @Override
    public String getColumnName(int col){
        return cols[col];
    }
    
    public void remove(int row){
        list.remove(row);
    }
    
    public Useri getUser(int index){
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
        Useri u = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return u.getId();
            case 1:
                return u.getUsername();
            case 2:
                return u.getRoleID();
            default:
                return null;
        }
    }
    
}

