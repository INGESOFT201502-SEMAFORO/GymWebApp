/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess.DAO;

import DataAccess.Entity.EntrenadorHasPlan;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Juan
 */
public class TrainerHasPlanDAO {
    public EntityManagerFactory emf1 = Persistence.createEntityManagerFactory("GymWebAppPU");
    
    public EntrenadorHasPlan persist(EntrenadorHasPlan trainerHasPlan){
        EntityManager em = emf1.createEntityManager();
        em.getTransaction().begin();
        
        try {
            em.persist(trainerHasPlan);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }finally{
            em.close();
            return trainerHasPlan;
        }
    }
    
    public EntrenadorHasPlan searchByNumRegister(Integer id){
        EntityManager em = emf1.createEntityManager();
        EntrenadorHasPlan trainerHasPlan = null;
        try {
            trainerHasPlan = em.find(EntrenadorHasPlan.class, id);
        } catch (Exception e) {
        }finally{
            em.close();
            return trainerHasPlan;
        }
    }
}
