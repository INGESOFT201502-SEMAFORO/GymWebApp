/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation.Bean;

import BusinessLogic.Controller.SessionController;
import DataAccess.Entity.Usuario;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Juan
 */
@Named(value = "sessionBean")
@RequestScoped
public class SessionBean {
    
    private Usuario user;
    SessionController session;
    
    public SessionBean() {
        
        session = new SessionController();
        user = session.getUser();
    }

    public String getName(){
        return session.getName();
    }
    
    public Usuario getUser(){
        return user;
    }
}