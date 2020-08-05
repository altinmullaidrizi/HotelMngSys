/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

import BLL.Booking;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Ilmi
 */
public class BookingTableModel extends AbstractTableModel {
    
    List <Booking> list;
    String [] cols = {"ID." , "Personi", "Room", "Checkin", "Checkout"};
    
    public BookingTableModel(){}
    
    public BookingTableModel(List<Booking> list){
        this.list = list;
    }
    
    public void addList(List<Booking> list){
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
    
    public Booking getBooking(int index){
        return list.get(index);
    }

    @Override
    public int getColumnCount() {
       return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Booking b = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return b.getId();
            case 1:
                return b.getPersonID();
            case 2:
                return b.getRoomID();
            case 3:
                return getDateToString(b.getCheckin());
            case 4:
                return getDateToString(b.getCheckout());
            default:
                return null;
        }
    }
    
    public String getDateToString(Date d){
        DateFormat da = new SimpleDateFormat("dd-MM-yyyy");
        return da.format(d);
    }
    
}
