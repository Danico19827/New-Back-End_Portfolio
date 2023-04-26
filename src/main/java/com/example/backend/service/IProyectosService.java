
package com.example.backend.service;

import com.example.backend.model.Proyectos;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface IProyectosService {
    
    public List<Proyectos> mostrarProyectos();
    
    public void crearProyecto(Proyectos proyecto);
    
    public void borrarProyecto(Long id);
    
    public Proyectos buscarProyecto(Long id);
    
}
