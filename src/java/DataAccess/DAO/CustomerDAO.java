/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess.DAO;

import DataAccess.Entity.Cliente;
import DataAccess.Entity.Usuario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Juan
 */
public class CustomerDAO {
    
    public EntityManagerFactory emf1 = Persistence.createEntityManagerFactory("GymWebAppPU");
    
    public Cliente persist (Cliente customer){
        EntityManager em = emf1.createEntityManager();
        em.getTransaction().begin();
        
        try {
            em.persist(customer);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }finally{
            em.close();
            return customer;
        }
    }
    
    public Cliente searchByDocument(Long document){
        EntityManager em = emf1.createEntityManager();
        Cliente customer = null;
        try {
            customer = em.find(Cliente.class, document);
        } catch (Exception e) {
        }finally{
            em.close();
            return customer;
        }
    }
    
    public Cliente searchByUser(Usuario user){
        EntityManager em = emf1.createEntityManager();
        Cliente customer = null;
        String query= "Select a From Cliente a Where a.usuario = :idUser";
        Query q = em.createQuery(query);
        q.setParameter("idUser", user);
        
        try {
            customer = (Cliente) q.getSingleResult();
        } catch (Exception e) {
        }finally{
            em.close();
            return customer;
        }
    }
}
