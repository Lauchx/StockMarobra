package Stock.Model.Entity;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-09-28T13:26:07", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Stock.class)
public class Stock_ { 

    public static volatile SingularAttribute<Stock, Integer> inbound;
    public static volatile SingularAttribute<Stock, Integer> outbond;
    public static volatile SingularAttribute<Stock, Long> id;
    public static volatile SingularAttribute<Stock, Integer> currentQuantity;

}