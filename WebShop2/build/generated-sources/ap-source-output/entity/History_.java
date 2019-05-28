package entity;

import entity.Client;
import entity.Product;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-28T13:39:57")
@StaticMetamodel(History.class)
public class History_ { 

    public static volatile SingularAttribute<History, Date> beginDate;
    public static volatile SingularAttribute<History, Product> product;
    public static volatile SingularAttribute<History, Client> client;
    public static volatile SingularAttribute<History, Long> id;

}