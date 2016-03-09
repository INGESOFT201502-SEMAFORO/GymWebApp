package DataAccess.Entity;

import DataAccess.Entity.Admin;
import DataAccess.Entity.Cliente;
import DataAccess.Entity.Entrenador;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-06T17:30:49")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> password;
    public static volatile CollectionAttribute<Usuario, Entrenador> entrenadorCollection;
    public static volatile CollectionAttribute<Usuario, Admin> adminCollection;
    public static volatile SingularAttribute<Usuario, Integer> idUsuario;
    public static volatile SingularAttribute<Usuario, String> rol;
    public static volatile SingularAttribute<Usuario, String> username;
    public static volatile CollectionAttribute<Usuario, Cliente> clienteCollection;

}