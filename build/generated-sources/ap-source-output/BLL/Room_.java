package BLL;

import BLL.Booking;
import BLL.Person;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-08-04T23:44:31")
@StaticMetamodel(Room.class)
public class Room_ { 

    public static volatile SingularAttribute<Room, Integer> roomNo;
    public static volatile SingularAttribute<Room, Boolean> hasWifi;
    public static volatile SingularAttribute<Room, Person> personID;
    public static volatile SingularAttribute<Room, Integer> id;
    public static volatile SingularAttribute<Room, Boolean> hasTV;
    public static volatile CollectionAttribute<Room, Booking> bookingCollection;
    public static volatile SingularAttribute<Room, Integer> capacity;

}