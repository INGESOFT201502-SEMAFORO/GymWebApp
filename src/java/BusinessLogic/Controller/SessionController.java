/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic.Controller;

import DataAccess.DAO.AdminDao;
import DataAccess.DAO.CustomerDAO;
import DataAccess.DAO.TrainerDAO;
import DataAccess.Entity.Admin;
import DataAccess.Entity.Cliente;
import DataAccess.Entity.Entrenador;
import DataAccess.Entity.Usuario;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Juan
 */
public class SessionController {
    private final HttpServletRequest httpServletRequest;
    private final FacesContext faceContext;
    private Usuario user;
    //private FacesMessage faceMessage;
    
    public SessionController(){
        faceContext = FacesContext.getCurrentInstance();
        httpServletRequest = (HttpServletRequest) faceContext.getExternalContext().getRequest();
        if (httpServletRequest.getSession().getAttribute("sessionUsuario") != null){
            user = (Usuario) httpServletRequest.getSession().getAttribute("sessionUsuario");
        }
    }
    
    public Usuario getUser(){
         return user;
    }
    
    public String getName(){
        switch(user.getRol()){
            case "Admin":
                AdminDao adminDAO = new AdminDao();
                Admin admin = adminDAO.searchByUser(user);
                return admin.getNombre();
                //break;
            case "Cliente":
                CustomerDAO customerDao = new CustomerDAO();
                Cliente customer = customerDao.searchByUser(user);
                return customer.getNombre();
                //break;
            case "Entrenador":
                TrainerDAO trainerDao = new TrainerDAO();
                Entrenador trainer = trainerDao.searchByUser(user);
                return trainer.getNombre();
                //break;
            default:
                return null;
        }
    }
}