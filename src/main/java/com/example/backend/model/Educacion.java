
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
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Basic
    private String tipoEducacion;
    private String descripcion;
    private boolean tieneLogo;
    private String logo;

    public Educacion() {
    }

    public Educacion(int id, String tipoEducacion, String descripcion, boolean tieneLogo, String logo) {
        this.id = id;
        this.tipoEducacion = tipoEducacion;
        this.descripcion = descripcion;
        this.tieneLogo = tieneLogo;
        this.logo = logo;
    }
    
    
}
