
package com.example.backend.service;

import com.example.backend.model.Usuario;
import com.example.backend.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService implements IUsuarioService{
    
    @Autowired
    public UsuarioRepository usuarioRepo;

    @Override
    public List<Usuario> mostrarUsuario() {
        List<Usuario> listaUsuarios = usuarioRepo.findAll();
        return listaUsuarios;
    }

    @Override
    public void crearUsuario(Usuario user) {
        usuarioRepo.save(user);
    }
    
    @Override
    public void borrarUsuario(int id) {
        usuarioRepo.deleteById(id);
    }

    @Override
    public Usuario buscarUsuario(int id) {
        Usuario user = usuarioRepo.findById(id).orElse(null);
        return user;
    }
    
}
