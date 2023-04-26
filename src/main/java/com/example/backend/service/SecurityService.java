
package com.example.backend.service;

import com.example.backend.model.Security;
import com.example.backend.repository.SecurityRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SecurityService implements ISecurityService {
    
    @Autowired
    public SecurityRepository secRepo;

    @Override
    public List<Security> mostrarAuth() {
        List<Security> listaSecurity = secRepo.findAll();
        return listaSecurity;
    }

    @Override
    public void crearAuth(Security auth) {
        secRepo.save(auth);
    }

    @Override
    public void borrarAuth(int id) {
        secRepo.deleteById(id);
    }

    @Override
    public Security buscarAuth(int id) {
        Security sec = secRepo.findById(id).orElse(null);
        return sec;
    }
    
}
