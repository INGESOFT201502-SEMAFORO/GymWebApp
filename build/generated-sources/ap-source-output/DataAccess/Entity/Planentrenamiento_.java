package DataAccess.Entity;

import DataAccess.Entity.EntrenadorHasPlan;
import DataAccess.Entity.Inscripcion;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-06T17:30:49")
@StaticMetamodel(Planentrenamiento.class)
public class Planentrenamiento_ { 

    public static volatile SingularAttribute<Planentrenamiento, String> instrucciones;
    public static volatile CollectionAttribute<Planentrenamiento, EntrenadorHasPlan> entrenadorHasPlanCollection;
    public static volatile SingularAttribute<Planentrenamiento, Integer> numPlan;
    public static volatile SingularAttribute<Planentrenamiento, Long> costo;
    public static volatile SingularAttribute<Planentrenamiento, String> nombre;
    public static volatile CollectionAttribute<Planentrenamiento, Inscripcion> inscripcionCollection;

}