package com.liferocks.hb.realtionship.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Prasad on 16-02-2020.
 */
@Entity
@Table(name = "PERSON")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PERSON_ID")
    private int userId;

    @Column(name = "PERSON_NAME")
    private String userName;

    /*@OneToOne
    @JoinColumn(name = "VEHICLE_ID")
    private Vehicle vehicle;*/

   /* @OneToMany (mappedBy = "person")*/
    /*@JoinTable (name= "PERSON_VEHICLE" ,joinColumns = @JoinColumn(name = "PERSON_ID"),
                    inverseJoinColumns = @JoinColumn(name = "VEHICLE_ID"))
    private Collection<Vehicle> vehicle = new ArrayList<Vehicle>(); */

    @ManyToMany
    private Collection<Vehicle> vehicle = new ArrayList<Vehicle>();

   /* public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }*/


    public Collection<Vehicle> getVehicle() {
        return vehicle;
    }

    public void setVehicle(Collection<Vehicle> vehicle) {
        this.vehicle = vehicle;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
