package com.liferocks.hb.collections.model;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Prasad on 15-02-2020.
 */

@Entity
@Table(name = "EMPLOYEE")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USER_ID")
    private int userId;

    @Column(name = "USER_NAME")
    private String username;

    @ElementCollection (fetch = FetchType.EAGER)
    @JoinTable(name = "EMPLOYEE_LOCATIONS",
        joinColumns = @JoinColumn(name = "USER_ID")
    )
    @GenericGenerator(name = "increment-gen", strategy = "increment")
    @CollectionId(columns = {@Column(name = "LOCATION_ID" )}, generator = "increment-gen", type = @Type(type = "long"))
    private Collection<Locations> locations = new ArrayList<Locations>();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Collection<Locations> getLocations() {
        return locations;
    }

    public void setLocations(Collection<Locations> locations) {
        this.locations = locations;
    }
}
