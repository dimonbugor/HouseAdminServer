package entitys;

import entitys.Apartment;
import entitys.PaymentsPK;
import entitys.Supplier;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-24T11:45:49")
@StaticMetamodel(Payments.class)
public class Payments_ { 

    public static volatile SingularAttribute<Payments, Date> month;
    public static volatile SingularAttribute<Payments, Float> amountPerMonth;
    public static volatile SingularAttribute<Payments, Supplier> supplier;
    public static volatile SingularAttribute<Payments, PaymentsPK> paymentsPK;
    public static volatile SingularAttribute<Payments, Apartment> apartment;

}