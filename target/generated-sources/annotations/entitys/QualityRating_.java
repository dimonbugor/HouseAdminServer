package entitys;

import entitys.Supplier;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-05T13:01:53")
@StaticMetamodel(QualityRating.class)
public class QualityRating_ { 

    public static volatile SetAttribute<QualityRating, Supplier> supplierCollection;
    public static volatile SingularAttribute<QualityRating, Integer> rating;
    public static volatile SingularAttribute<QualityRating, Integer> id;

}