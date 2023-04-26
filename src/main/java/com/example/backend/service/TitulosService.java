
package com.example.backend.service;

import com.example.backend.model.Titulos;
import com.example.backend.repository.TitulosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TitulosService implements ITitulosService {
    
    @Autowired
    public TitulosRepository titulosRepo;

    @Override
    public List<Titulos> mostrarTitulos() {
        List<Titulos> listaUsuarios = titulosRepo.findAll();
        return listaUsuarios;
    }

    @Override
    public void crearTitulo(Titulos titulo) {
        titulosRepo.save(titulo);
    }

    @Override
    public void borrarTitulo(Long id) {
        titulosRepo.deleteById(id);
    }

    @Override
    public Titulos buscarTitulo(Long id) {
        return titulosRepo.findById(id).orElse(null);
    }
    
    
    
}
