package com.liferocks.hb.realtionship;

import com.liferocks.hb.realtionship.model.Person;
import com.liferocks.hb.realtionship.model.Vehicle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by Prasad on 16-02-2020.
 */
public class RealtionShipTest {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Person person = new Person();
        person.setUserName("Prasad");
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleName("BMW");
        //person.setVehicle(vehicle);

        Vehicle vehicle2 = new Vehicle();
        vehicle2.setVehicleName("AUDI");

        person.getVehicle().add(vehicle);
        person.getVehicle().add(vehicle2);

        /*vehicle.setPerson(person);
        vehicle2.setPerson(person);*/

        vehicle.getPersons().add(person);
        vehicle.getPersons().add(person);


        session.save(person);
        session.save(vehicle);
        session.save(vehicle2);

        /* This is also possible

        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleName("BMW");
        session.save(vehicle);*/

        session.getTransaction().commit();
        session.close();


    }
}
