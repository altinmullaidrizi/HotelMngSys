package BLL;

import BLL.Person;
import BLL.Room;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-08-04T23:44:31")
@StaticMetamodel(Booking.class)
public class Booking_ { 

    public static volatile SingularAttribute<Booking, Date> checkin;
    public static volatile SingularAttribute<Booking, Person> personID;
    public static volatile SingularAttribute<Booking, Integer> id;
    public static volatile SingularAttribute<Booking, Date> checkout;
    public static volatile SingularAttribute<Booking, Room> roomID;

}