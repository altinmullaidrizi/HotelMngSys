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
public class RoomRepository extends EntMngClass implements RoomInterface {

    @Override
    public void create(Room r) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.persist(r);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Room r) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.merge(r);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Room r) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.remove(r);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Room> findAll() throws CrudFormException {
        try{
            return em.createNamedQuery("Room.findAll").getResultList();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public Room findByID(Integer ID) throws CrudFormException {
        throw new UnsupportedOperationException("Not supported yet. Ne javet ne vijim"); //To change body of generated methods, choose Tools | Templates.
    }
    
}
