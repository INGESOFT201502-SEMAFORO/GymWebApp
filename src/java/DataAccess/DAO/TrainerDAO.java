/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess.DAO;

import DataAccess.Entity.Entrenador;
import DataAccess.Entity.Usuario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Juan
 */
public class TrainerDAO {
    
    public EntityManagerFactory emf1 = Persistence.createEntityManagerFactory("GymWebAppPU");
    
    public Entrenador persist (Entrenador trainer){
        EntityManager em = emf1.createEntityManager();
        em.getTransaction().begin();
        
        try {
            em.persist(trainer);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }finally{
            em.close();
            return trainer;
        }
    }
    
    public Entrenador searchByDocument(Long document){
        EntityManager em = emf1.createEntityManager();
        Entrenador trainer = null;
        try {
            trainer = em.find(Entrenador.class, document);
        } catch (Exception e) {
        }finally{
            em.close();
            return trainer;
        }
    }
    
    public Entrenador searchByUser(Usuario user){
        EntityManager em = emf1.createEntityManager();
        Entrenador trainer = null;
        String query= "Select a From Entrenador a Where a.usuario = :idUser";
        Query q = em.createQuery(query);
        q.setParameter("idUser", user);
        
        try {
            trainer = (Entrenador) q.getSingleResult();
        } catch (Exception e) {
        }finally{
            em.close();
            return trainer;
        }
    }
}
