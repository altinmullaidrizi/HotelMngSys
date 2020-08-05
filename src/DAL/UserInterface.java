/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Useri;
import java.util.List;

/**
 *
 * @author Ilmi
 */
public interface UserInterface {
    void create(Useri u) throws CrudFormException;
    void edit(Useri u) throws CrudFormException;
    void delete(Useri u) throws CrudFormException;
    List<Useri> findAll() throws CrudFormException;
    Useri findByID(Integer ID) throws CrudFormException;
    Useri loginByUsernameAndPassword(String u, String p) throws CrudFormException;
}
