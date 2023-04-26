
package com.example.backend.service;

import com.example.backend.model.Educacion;
import com.example.backend.repository.EducacionRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EducacionService implements IEducacionService {
    
    @Autowired
    public EducacionRepository eduRepo;

    @Override
    public List<Educacion> mostrarEducacion() {
        List<Educacion> listaEducacion = eduRepo.findAll();
        return listaEducacion;
    }

    @Override
    public void crearEducacion(Educacion edu) {
        eduRepo.save(edu);
    }

    @Override
    public void borrarEducacion(int id) {
        eduRepo.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(int id) {
        Educacion edu = eduRepo.findById(id).orElse(null);
        return edu;
    }
    
}
