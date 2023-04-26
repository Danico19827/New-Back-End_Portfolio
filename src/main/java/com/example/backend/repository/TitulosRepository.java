
package com.example.backend.repository;

import com.example.backend.model.Titulos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TitulosRepository extends JpaRepository <Titulos, Long> {
    
}
