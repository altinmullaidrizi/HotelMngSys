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

public class PersonRepository extends EntMngClass implements PersonInterface {

    @Override
    public void create(Person p) throws CrudFormException {
       try{
           em.getTransaction().begin();
           em.persist(p);
           em.getTransaction().commit();
       }catch(Exception e){
           throw new CrudFormException("Msg \n" + e.getMessage());
       }
    }

    @Override
    public void edit(Person p) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.merge(p);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Person p) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.remove(p);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Person> findAll() throws CrudFormException {
        try{
            return em.createNamedQuery("Person.findAll").getResultList();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public Person findByID(Integer ID) throws CrudFormException {
        throw new UnsupportedOperationException("Not supported yet. Per javet ne vijim"); //To change body of generated methods, choose Tools | Templates.
    }
    
}
