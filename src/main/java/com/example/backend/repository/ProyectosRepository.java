
package com.example.backend.repository;

import com.example.backend.model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProyectosRepository extends JpaRepository <Proyectos, Long>{
    
}
