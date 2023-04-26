
package com.example.backend.service;

import com.example.backend.model.Habilidades;
import com.example.backend.repository.HabilidadesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadesService implements IHabilidadesService{
    
    @Autowired
    public HabilidadesRepository habilidadRepo;

    @Override
    public List<Habilidades> mostrarHabilidades() {
        List<Habilidades> listaHabilidades = habilidadRepo.findAll();
        return listaHabilidades;
    }

    @Override
    public void crearHabilidad(Habilidades habilidad) {
        habilidadRepo.save(habilidad);
    }

    @Override
    public void borrarHabilidad(Long id) {
        habilidadRepo.deleteById(id);
    }

    @Override
    public Habilidades buscarHabilidad(Long id) {
        return habilidadRepo.findById(id).orElse(null);}
    
    
}
