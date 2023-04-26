
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
public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Basic
    private String nombre;
    private String descripcion;
    private String razon;
    private String url;

    public Proyectos() {
    }

    public Proyectos(Long id, String nombre, String descripcion, String razon, String url) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.razon = razon;
        this.url = url;
    }
    
    
    
}
