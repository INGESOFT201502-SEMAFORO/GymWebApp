package DataAccess.Entity;

import DataAccess.Entity.Entrenador;
import DataAccess.Entity.Planentrenamiento;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-06T17:30:49")
@StaticMetamodel(EntrenadorHasPlan.class)
public class EntrenadorHasPlan_ { 

    public static volatile SingularAttribute<EntrenadorHasPlan, Planentrenamiento> planEntrenamientonumPlan;
    public static volatile SingularAttribute<EntrenadorHasPlan, Entrenador> entrenadordocumento;
    public static volatile SingularAttribute<EntrenadorHasPlan, Integer> id;

}