/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Booking;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Ilmi
 */
public class BookingRepository extends EntMngClass implements BookingInterface{
   

    @Override
    public void create(Booking b) throws CrudFormException {
        try{
           em.getTransaction().begin();
           em.persist(b);
           em.getTransaction().commit();
       }catch(Exception e){
           throw new CrudFormException("Msg \n" + e.getMessage());
       }
    }

    @Override
    public void edit(Booking b) throws CrudFormException {
         try{
            em.getTransaction().begin();
            em.merge(b);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Booking b) throws CrudFormException {
         try{
            em.getTransaction().begin();
            em.remove(b);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Booking> findAll() throws CrudFormException {
        try{
            return em.createNamedQuery("Booking.findAll").getResultList();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public Booking findByID(Integer ID) throws CrudFormException {
        try {
            Query query = em.createQuery("SELECT u FROM Booking b WHERE b.id = :abc");
            query.setParameter("abc", ID);
            return (Booking) query.getSingleResult();
        } catch (Exception e) {
            throw new CrudFormException("Msg! \n" + e.getMessage());
        }
    }
    
}
