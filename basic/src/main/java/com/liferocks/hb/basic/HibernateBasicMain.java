package com.liferocks.hb.basic;

import com.liferocks.hb.basic.model.Address;
import com.liferocks.hb.basic.model.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

/**
 * Created by Prasad on 15-02-2020.
 */
public class HibernateBasicMain {

    public static void main(String[] args) {
        UserDetails userDetails = new UserDetails();
        //userDetails.setUserId(1);
        userDetails.setUsername("Prasad");
        userDetails.setJoiningDate(new Date());
        userDetails.setDescription("This is for the user description");

        Address homeAddress = new Address();
        homeAddress.setCity("Pune");
        homeAddress.setPin("411057");
        homeAddress.setState("Maharastra");
        homeAddress.setStreet("Datta mandir road");

        userDetails.setHomeAddress(homeAddress);

        Address officeAddress = new Address();
        officeAddress.setCity("Pune");
        officeAddress.setPin("411057");
        officeAddress.setState("Maharastra");
        officeAddress.setStreet("Hinjawadi");

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(userDetails);
        session.getTransaction().commit();
        session.close();

        /*userDetails = null;
        session = sessionFactory.openSession();
        session.beginTransaction();
        userDetails = session.get(UserDetails.class,1);
        System.out.println("User Name : " + userDetails.getUsername());*/
    }
}
