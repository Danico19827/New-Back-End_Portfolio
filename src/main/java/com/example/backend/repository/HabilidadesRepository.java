
package com.example.backend.repository;

import com.example.backend.model.Habilidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HabilidadesRepository extends JpaRepository <Habilidades, Long> {
    
}