package com.liferocks.hb.inheritance;

import com.liferocks.hb.inheritance.model.FourWheeler;
import com.liferocks.hb.inheritance.model.TwoWheeler;
import com.liferocks.hb.inheritance.model.Vehicle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by Prasad on 16-02-2020.
 */
public class InheritanceTest {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleName("CAR");

        TwoWheeler bike = new TwoWheeler();
        bike.setVehicleName("BIKE");
        bike.setSteeringHandle("Bike Steering Handle");

        FourWheeler fourWheeler = new FourWheeler();
        fourWheeler.setVehicleName("AUDI");
        fourWheeler.setWheelHandle("Four wheeler handle");

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(vehicle);
        session.save(bike);
        session.save(fourWheeler);
        session.getTransaction().commit();
        session.close();
    }
}
