package entitys;

import entitys.AvailablityRating;
import entitys.Category;
import entitys.Payments;
import entitys.QualityRating;
import entitys.SupplierPK;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-24T11:40:01")
@StaticMetamodel(Supplier.class)
public class Supplier_ { 

    public static volatile SingularAttribute<Supplier, SupplierPK> supplierPK;
    public static volatile SingularAttribute<Supplier, String> phone;
    public static volatile CollectionAttribute<Supplier, Payments> paymentsCollection;
    public static volatile SingularAttribute<Supplier, Float> price;
    public static volatile SingularAttribute<Supplier, AvailablityRating> availablityRating;
    public static volatile SingularAttribute<Supplier, String> name;
    public static volatile SingularAttribute<Supplier, Category> category;
    public static volatile SingularAttribute<Supplier, QualityRating> qualityRating;

}