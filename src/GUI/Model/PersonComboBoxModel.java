/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

import BLL.Person;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author Ilmi
 */
public class PersonComboBoxModel extends AbstractListModel<Person> implements ComboBoxModel<Person> {

    private List<Person> data;
    private Person selectedItem;
    
    public PersonComboBoxModel(){}
    
    public PersonComboBoxModel(List<Person> data){
        this.data = data;
    }
    
    public void add(List<Person> data){
        this.data = data;
    }
    
    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public Person getElementAt(int index) {
        return data.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectedItem = (Person)anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selectedItem;
    }
}
