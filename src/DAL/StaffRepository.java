/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Staff;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Ilmi
 */
public class StaffRepository extends EntMngClass implements StaffInterface {

       @Override
    public void create(Staff s) throws CrudFormException {
        try {
            em.getTransaction().begin();
            em.persist(s);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Staff us) throws CrudFormException {
        try {
            em.getTransaction().begin();
            em.merge(us);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Staff us) throws CrudFormException {
        try {
            em.getTransaction().begin();
            em.remove(us);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Staff> findAll() throws CrudFormException {
        try {
            return em.createNamedQuery("Staff.findAll").getResultList();
        } catch (Exception e) {
            throw new CrudFormException("Msg! \n" + e.getMessage());
        }
    }

   
    
    @Override
    public Staff findByID(Integer ID) throws CrudFormException {
        try {
            Query query = em.createQuery("SELECT u FROM Staff u WHERE u.id = :abc");
            query.setParameter("abc", ID);
            return (Staff) query.getSingleResult();
        } catch (Exception e) {
            throw new CrudFormException("Msg! \n" + e.getMessage());
        }
    }

    
}
