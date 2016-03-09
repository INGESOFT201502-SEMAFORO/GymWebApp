package DataAccess.Entity;

import DataAccess.Entity.Cliente;
import DataAccess.Entity.Planentrenamiento;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-06T17:30:49")
@StaticMetamodel(Inscripcion.class)
public class Inscripcion_ { 

    public static volatile SingularAttribute<Inscripcion, Planentrenamiento> numPlan;
    public static volatile SingularAttribute<Inscripcion, Integer> numInscripcion;
    public static volatile SingularAttribute<Inscripcion, Cliente> documento;

}