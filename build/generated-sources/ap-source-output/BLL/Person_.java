package BLL;

import BLL.Booking;
import BLL.Room;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-08-04T23:44:31")
@StaticMetamodel(Person.class)
public class Person_ { 

    public static volatile SingularAttribute<Person, Date> birthdate;
    public static volatile SingularAttribute<Person, String> name;
    public static volatile CollectionAttribute<Person, Room> roomCollection;
    public static volatile SingularAttribute<Person, Integer> id;
    public static volatile CollectionAttribute<Person, Booking> bookingCollection;

}