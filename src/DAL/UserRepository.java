/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Useri;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Ilmi
 */
public class UserRepository extends EntMngClass implements UserInterface {
    
    @Override
    public void create(Useri us) throws CrudFormException {
        try {
            em.getTransaction().begin();
            em.persist(us);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Useri us) throws CrudFormException {
        try {
            em.getTransaction().begin();
            em.merge(us);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Useri us) throws CrudFormException {
        try {
            em.getTransaction().begin();
            em.remove(us);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Useri> findAll() throws CrudFormException {
        try {
            return em.createNamedQuery("Useri.findAll").getResultList();
        } catch (Exception e) {
            throw new CrudFormException("Msg! \n" + e.getMessage());
        }
    }

   
    
    @Override
    public Useri findByID(Integer ID) throws CrudFormException {
        try {
            Query query = em.createQuery("SELECT u FROM Useri u WHERE u.id = :abc");
            query.setParameter("abc", ID);
            return (Useri) query.getSingleResult();
        } catch (Exception e) {
            throw new CrudFormException("Msg! \n" + e.getMessage());
        }
    }

    @Override
    public Useri loginByUsernameAndPassword(String u, String p) throws CrudFormException {
        try {
            Query query = em.createQuery("SELECT u FROM Useri u WHERE u.username = :us AND u.password=:psw");
            query.setParameter("us", u);
            query.setParameter("psw", p);
            return (Useri) query.getSingleResult();
        } catch (Exception e) {
            throw new CrudFormException("Msg! \n" + e.getMessage());
        }
    }
    
    
}
