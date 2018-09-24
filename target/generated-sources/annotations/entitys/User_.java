package entitys;

import entitys.Apartment;
import entitys.Rolle;
import entitys.UserPK;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-24T11:40:01")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> lastName;
    public static volatile SingularAttribute<User, String> password;
    public static volatile SingularAttribute<User, Rolle> rolle;
    public static volatile SingularAttribute<User, String> name;
    public static volatile SingularAttribute<User, UserPK> userPK;
    public static volatile SingularAttribute<User, String> email;
    public static volatile SingularAttribute<User, Apartment> apartment;

}