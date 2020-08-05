/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

/**
 *
 * @author Ilmi
 */

import java.util.List;
import BLL.Person;

public interface PersonInterface {
    void create(Person p) throws CrudFormException;
    void edit(Person p) throws CrudFormException;
    void delete(Person p) throws CrudFormException;
    List <Person> findAll() throws CrudFormException;
    Person findByID(Integer ID) throws CrudFormException;
}
