package entitys;

import entitys.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-05T13:01:53")
@StaticMetamodel(Rolle.class)
public class Rolle_ { 

    public static volatile SetAttribute<Rolle, User> userCollection;
    public static volatile SingularAttribute<Rolle, Integer> id;
    public static volatile SingularAttribute<Rolle, String> rolleTitle;
    public static volatile SingularAttribute<Rolle, Integer> seniority;

}