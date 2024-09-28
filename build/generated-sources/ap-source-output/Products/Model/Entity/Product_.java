package Products.Model.Entity;

import Stock.Model.Entity.Stock;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-09-28T13:26:07", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile SingularAttribute<Product, String> name;
    public static volatile SingularAttribute<Product, Integer> width;
    public static volatile SingularAttribute<Product, Integer> length;
    public static volatile SingularAttribute<Product, Long> id;
    public static volatile SingularAttribute<Product, String> category;
    public static volatile SingularAttribute<Product, Stock> stock;
    public static volatile SingularAttribute<Product, Integer> height;

}