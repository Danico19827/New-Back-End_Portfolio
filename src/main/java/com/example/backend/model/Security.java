
package com.example.backend.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter @Getter
public class Security {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Basic
    private String user;
    private String password;
    private boolean coincide;

    public Security() {
    }

    public Security(String user, String password, boolean coincide) {
        this.user = user;
        this.password = password;
        this.coincide = coincide;
    }
    
    
}
