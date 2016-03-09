/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation.Bean;

import BusinessLogic.Controller.LoginController;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Juan
 */
@Named(value = "loginBean")
@RequestScoped
public class LoginBean {
    private String username;
    private String password;
    private final LoginController login;
    
    public LoginBean(){
        login = new LoginController();
    }
    
    public String login(){
        return login.login(username, password);
    }
    
    public String logout(){
        return login.logout();
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
