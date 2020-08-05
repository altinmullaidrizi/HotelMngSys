/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Room;
import java.util.List;

/**
 *
 * @author Ilmi
 */
public interface RoomInterface {
    void create(Room r) throws CrudFormException;
    void edit(Room r) throws CrudFormException;
    void delete(Room r) throws CrudFormException;
    List<Room> findAll() throws CrudFormException;
    Room findByID(Integer ID) throws CrudFormException;
}
