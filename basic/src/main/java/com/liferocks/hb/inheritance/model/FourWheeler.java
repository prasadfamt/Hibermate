package com.liferocks.hb.inheritance.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by Prasad on 16-02-2020.
 */

@Entity
@DiscriminatorValue("FW")
public class FourWheeler extends Vehicle {

    private String wheelHandle;

    public String getWheelHandle() {
        return wheelHandle;
    }

    public void setWheelHandle(String wheelHandle) {
        this.wheelHandle = wheelHandle;
    }
}
