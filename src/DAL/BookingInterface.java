/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Booking;
import java.util.List;

/**
 *
 * @author Ilmi
 */
public interface BookingInterface {
    void create(Booking b) throws CrudFormException;
    void edit(Booking b) throws CrudFormException;
    void delete(Booking b) throws CrudFormException;
    List <Booking> findAll() throws CrudFormException;
    Booking findByID(Integer ID) throws CrudFormException;
}
