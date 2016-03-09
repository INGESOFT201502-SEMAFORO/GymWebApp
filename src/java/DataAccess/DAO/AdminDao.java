/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess.DAO;

import DataAccess.Entity.Admin;
import DataAccess.Entity.Usuario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Juan
 */
public class AdminDao {
    
    public EntityManagerFactory emf1 = Persistence.createEntityManagerFactory("GymWebAppPU");
    
    public Admin persist (Admin admin){
        EntityManager em = emf1.createEntityManager();
        em.getTransaction().begin();
        
        try {
            em.persist(admin);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }finally{
            em.close();
            return admin;
        }
    }
    
    public Admin searchById(Integer id){
        EntityManager em = emf1.createEntityManager();
        Admin admin = null;
        try {
            admin = em.find(Admin.class, id);
        } catch (Exception e) {
        }finally{
            em.close();
            return admin;
        }
    }
    
    public Admin searchByUser(Usuario user){
        EntityManager em = emf1.createEntityManager();
        Admin admin = null;
        //String query= "SELECT a FROM Admin a, Usuario u WHERE a.usuario = u.idUsuario AND u.idUsuario = :idUsuario";
        String query= "Select a From Admin a Where a.usuario = :idUser";
        Query q = em.createQuery(query);
        q.setParameter("idUser", user);
        
        try {
            admin = (Admin) q.getSingleResult();
        } catch (Exception e) {
        }finally{
            em.close();
            return admin;
        }
    }
    
}
