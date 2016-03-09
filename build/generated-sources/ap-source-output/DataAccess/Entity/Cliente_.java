package DataAccess.Entity;

import DataAccess.Entity.Inscripcion;
import DataAccess.Entity.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-06T17:30:49")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, Long> documento;
    public static volatile SingularAttribute<Cliente, Usuario> usuario;
    public static volatile SingularAttribute<Cliente, String> nombre;
    public static volatile SingularAttribute<Cliente, String> email;
    public static volatile CollectionAttribute<Cliente, Inscripcion> inscripcionCollection;

}