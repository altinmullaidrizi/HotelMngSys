/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

import BLL.Staff;
import static java.util.Collections.list;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Ilmi
 */
public class StaffTableModel extends AbstractTableModel {
    List<Staff> list;
    String [] cols = {"ID", "Name", "Surnmae", "Profession", "Phone"};
    
    public StaffTableModel(){}
    
    public StaffTableModel(List<Staff> list){
        this.list = list;
    }
    
      public void addList(List<Staff> list){
        this.list = list;
    }
    
    @Override
    public String getColumnName(int col){
        return cols[col];
    }
    
    @Override
    public int getRowCount() {
        return list.size(); 
    }

    
    public void remove(int row){
        list.remove(row);
    }
    
    public Staff getStaff(int index){
        return list.get(index);
    }
    
    @Override
    public int getColumnCount() {
       return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Staff s = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return s.getId();
            case 1:
                return s.getName();
            case 2:
                return s.getSurname();
            case 3:
                return s.getProfession();
            case 4:
                return s.getPhone();
            default:
                return null;
        }
    }
}
