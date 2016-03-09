package DataAccess.Entity;

import DataAccess.Entity.EntrenadorHasPlan;
import DataAccess.Entity.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-06T17:30:49")
@StaticMetamodel(Entrenador.class)
public class Entrenador_ { 

    public static volatile CollectionAttribute<Entrenador, EntrenadorHasPlan> entrenadorHasPlanCollection;
    public static volatile SingularAttribute<Entrenador, Double> salario;
    public static volatile SingularAttribute<Entrenador, Long> documento;
    public static volatile SingularAttribute<Entrenador, Usuario> usuario;
    public static volatile SingularAttribute<Entrenador, String> nombre;

}