package com.liferocks.hb.collections;

import com.liferocks.hb.collections.model.Employee;
import com.liferocks.hb.collections.model.Locations;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Prasad on 15-02-2020.
 */
public class CollectionsMainTest {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setUsername("Prasad");

        Locations homeLocations = new Locations();
        homeLocations.setCity("Pune");
        homeLocations.setPin("411057");
        homeLocations.setState("Maharastra");
        homeLocations.setStreet("Datta mandir road");

        Locations officeLocations = new Locations();
        officeLocations.setCity("Pune");
        officeLocations.setPin("411057");
        officeLocations.setState("Maharastra");
        officeLocations.setStreet("Hinjawadi");

        Collection<Locations> locationsList = new ArrayList<Locations>();
        locationsList.add(homeLocations);
        locationsList.add(officeLocations);
        employee.setLocations(locationsList);

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(employee);
        session.getTransaction().commit();
        session.close();

        employee = null;
        session = sessionFactory.openSession();
        employee = session.get(Employee.class, 1);
        //session.close(); // added the fetch type as eager on collctions.
        System.out.println("Locations size: " + employee.getLocations().size() );
        session.close();
    }
}
