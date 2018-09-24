package entitys;

import entitys.Supplier;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-24T11:45:49")
@StaticMetamodel(QualityRating.class)
public class QualityRating_ { 

    public static volatile CollectionAttribute<QualityRating, Supplier> supplierCollection;
    public static volatile SingularAttribute<QualityRating, Integer> rating;
    public static volatile SingularAttribute<QualityRating, Integer> id;

}