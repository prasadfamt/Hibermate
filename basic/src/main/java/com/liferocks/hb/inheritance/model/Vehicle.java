package com.liferocks.hb.inheritance.model;

import javax.persistence.*;

/**
 * Created by Prasad on 16-02-2020.
 */
@Entity
@Table(name = "VEHICLE")
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "VEHICLE_TYPE", discriminatorType = DiscriminatorType.STRING)
public class Vehicle {
    @Id
    @GeneratedValue
    @Column(name = "VEHICLE_ID")
    private int vehicleId;

    @Column(name = "VEHICLE_NAME")
    private String vehicleName;

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }
}
