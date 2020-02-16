package com.liferocks.hb.inheritance.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by Prasad on 16-02-2020.
 */

@Entity
@DiscriminatorValue("TW")
public class TwoWheeler extends  Vehicle {

    private String steeringHandle;

    public String getSteeringHandle() {
        return steeringHandle;
    }

    public void setSteeringHandle(String steeringHandle) {
        this.steeringHandle = steeringHandle;
    }
}
