/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess.DAO;

import DataAccess.Entity.Planentrenamiento;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Juan
 */
public class TrainingPlanDAO {
    
    public EntityManagerFactory emf1 = Persistence.createEntityManagerFactory("GymWebAppPU");
    
    public Planentrenamiento persist(Planentrenamiento trainingPlan){
        EntityManager em = emf1.createEntityManager();
        em.getTransaction().begin();
        
        try {
            em.persist(trainingPlan);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }finally{
            em.close();
            return trainingPlan;
        }
    }
    
    public Planentrenamiento searchByNumPlan(Integer id){
        EntityManager em = emf1.createEntityManager();
        Planentrenamiento trainingPlan = null;
        try {
            trainingPlan = em.find(Planentrenamiento.class, id);
        } catch (Exception e) {
        }finally{
            em.close();
            return trainingPlan;
        }
    }
}
