
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
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Basic
    private String nombre;
    private int edad;
    private String descripcion;
    private String url;
    
    
    public Usuario() {
    }

    public Usuario(int id, String nombre, int edad, String descripcion, String url) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.descripcion = descripcion;
        this.url = url;
    }
    
    
}
 