package com.liferocks.hb.basic.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Prasad on 15-02-2020.
 */

@Entity
public class UserDetails {

    @Id
    private int userId;

    private String username;

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
}
