package entitys;

import entitys.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-24T11:40:01")
@StaticMetamodel(Rolle.class)
public class Rolle_ { 

    public static volatile CollectionAttribute<Rolle, User> userCollection;
    public static volatile SingularAttribute<Rolle, Integer> id;
    public static volatile SingularAttribute<Rolle, String> rolleTitle;
    public static volatile SingularAttribute<Rolle, Integer> seniority;

}