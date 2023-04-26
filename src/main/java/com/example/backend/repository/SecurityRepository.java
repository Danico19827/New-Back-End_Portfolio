
package com.example.backend.repository;

import com.example.backend.model.Security;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecurityRepository extends JpaRepository <Security, Integer> {
    
}
