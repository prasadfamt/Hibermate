package com.liferocks.hb.basic.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Prasad on 15-02-2020.
 */

@Entity
@Table(name = "USER_DETAILS")
public class UserDetails {

    @Transient
    private String test;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USER_ID")
    @Basic
    private int userId;

    @Column(name = "USER_NAME")
    @Basic
    private String username;

    @Column(name = "JOINING_DATE")
    @Temporal(TemporalType.DATE)
    private Date joiningDate;

    @Column(name = "DESCRIPTION")
    @Lob
    private String description;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "street", column = @Column(name="HOME_STREET")),
            @AttributeOverride(name = "city", column = @Column(name="HOME_CITY")),
            @AttributeOverride(name = "state", column = @Column(name="HOME_STATE")),
            @AttributeOverride(name = "pin", column = @Column(name="HOME_PIN"))
    })
    private Address homeAddress;

    @Embedded
    private Address officeAddress;

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(Address officeAddress) {
        this.officeAddress = officeAddress;
    }

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

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
