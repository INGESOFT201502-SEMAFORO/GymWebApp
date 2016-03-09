/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic.Controller;

import DataAccess.DAO.TrainingPlanDAO;
import DataAccess.Entity.Planentrenamiento;

/**
 *
 * @author Juan
 */
public class ManageTrainingPlan {
    
    public String createPlan(Planentrenamiento trainingPlan){
        
        TrainingPlanDAO trainingPlanDAO = new TrainingPlanDAO();
        Planentrenamiento trainingPlanPersist = trainingPlanDAO.persist(trainingPlan);
        
        if (trainingPlanPersist != null){
            return "se creo el plan";
        }else{
            return "no se pudo crear el plan";
        }
    }
    
    
    
}
