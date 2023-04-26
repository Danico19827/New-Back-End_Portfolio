
package com.example.backend.service;

import com.example.backend.model.Habilidades;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface IHabilidadesService {
 
    public List<Habilidades> mostrarHabilidades();
    
    public void crearHabilidad(Habilidades habilidad);
    
    public void borrarHabilidad(Long id);
    
    public Habilidades buscarHabilidad(Long id);
    
}
