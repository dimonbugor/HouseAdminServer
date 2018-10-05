package entitys;

import entitys.Payments;
import entitys.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-05T13:01:54")
@StaticMetamodel(Apartment.class)
public class Apartment_ { 

    public static volatile SetAttribute<Apartment, Payments> paymentsCollection;
    public static volatile SetAttribute<Apartment, User> userCollection;
    public static volatile SingularAttribute<Apartment, Integer> id;
    public static volatile SingularAttribute<Apartment, Integer> apartmentNumber;

}