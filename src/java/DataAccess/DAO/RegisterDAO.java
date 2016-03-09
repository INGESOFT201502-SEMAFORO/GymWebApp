/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess.DAO;

import DataAccess.Entity.Inscripcion;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Juan
 */
public class RegisterDAO {
    public EntityManagerFactory emf1 = Persistence.createEntityManagerFactory("GymWebAppPU");
    
    public Inscripcion persist(Inscripcion register){
        EntityManager em = emf1.createEntityManager();
        em.getTransaction().begin();
        
        try {
            em.persist(register);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }finally{
            em.close();
            return register;
        }
    }
    
    public Inscripcion searchByNumRegister(Integer id){
        EntityManager em = emf1.createEntityManager();
        Inscripcion register = null;
        try {
            register = em.find(Inscripcion.class, id);
        } catch (Exception e) {
        }finally{
            em.close();
            return register;
        }
    }
}