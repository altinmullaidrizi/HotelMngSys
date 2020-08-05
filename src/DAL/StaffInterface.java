/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Staff;
import java.util.List;

/**
 *
 * @author Ilmi
 */
public interface StaffInterface {
     void create(Staff s) throws CrudFormException;
    void edit(Staff s) throws CrudFormException;
    void delete(Staff s) throws CrudFormException;
    List<Staff> findAll() throws CrudFormException;
    Staff findByID(Integer ID) throws CrudFormException;
}
