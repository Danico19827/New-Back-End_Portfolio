
package com.example.backend.service;

import com.example.backend.model.Usuario;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface IUsuarioService {
    
    public List<Usuario> mostrarUsuario();
    
    public void crearUsuario(Usuario user);
    
    public void borrarUsuario(int id);
    
    public Usuario buscarUsuario(int id);
    
}
