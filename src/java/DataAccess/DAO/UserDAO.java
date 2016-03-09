/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess.DAO;

import DataAccess.Entity.Usuario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Juan
 */
public class UserDAO {
    
    public EntityManagerFactory emf1 = Persistence.createEntityManagerFactory("GymWebAppPU");
    
    public Usuario persist (Usuario user){
        EntityManager em = emf1.createEntityManager();
        em.getTransaction().begin();
        
        try {
            em.persist(user);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }finally{
            em.close();
            return user;
        }
    }
    
    public Usuario searchByUsername (String username){
        EntityManager em = emf1.createEntityManager();
        Usuario user = null;
        Query q = em.createNamedQuery("Usuario.findByUsername");
       q.setParameter("username", username);
        try {
            user = (Usuario) q.getSingleResult();
        } catch (Exception e) {
        }finally{
            em.close();
            return user;
        }
    }
    
    public Usuario searchById (Integer id){
        EntityManager em = emf1.createEntityManager();
        Usuario user = null;
        try {
            user = em.find(Usuario.class, id);
            
        } catch (Exception e) {
        }finally{
            em.close();
            return user;
        }
    }
   
}