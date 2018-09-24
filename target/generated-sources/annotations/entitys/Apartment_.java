package entitys;

import entitys.Payments;
import entitys.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-24T11:40:01")
@StaticMetamodel(Apartment.class)
public class Apartment_ { 

    public static volatile CollectionAttribute<Apartment, Payments> paymentsCollection;
    public static volatile CollectionAttribute<Apartment, User> userCollection;
    public static volatile SingularAttribute<Apartment, Integer> id;
    public static volatile SingularAttribute<Apartment, Integer> apartmentNumber;

}