package DataAccess.Entity;

import DataAccess.Entity.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-06T17:30:49")
@StaticMetamodel(Admin.class)
public class Admin_ { 

    public static volatile SingularAttribute<Admin, Integer> idAdmin;
    public static volatile SingularAttribute<Admin, Usuario> usuario;
    public static volatile SingularAttribute<Admin, String> nombre;

}