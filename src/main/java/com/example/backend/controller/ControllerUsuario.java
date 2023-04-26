package com.example.backend.controller;

import com.example.backend.model.Usuario;
import com.example.backend.service.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("usuario")
public class ControllerUsuario {

    @Autowired
    private IUsuarioService userServ;

    @PostMapping("/new/usuario")
    public void agregarUsuario(@RequestBody Usuario user) {
        userServ.crearUsuario(user);
    }

    @GetMapping("/lista")
    @ResponseBody
    public List<Usuario> verUsuario() {
        return userServ.mostrarUsuario();
    }
    
    @DeleteMapping("/pop/{id}")
    public void eliminarUsuario(@PathVariable int id) {
        userServ.borrarUsuario(id);
    }

    @GetMapping("/find/{id}")
    @ResponseBody
    public Usuario verUsuario(@PathVariable int id) {
        Usuario user = userServ.buscarUsuario(id);
        return user;
    }
    
    @PutMapping("/actualizar")
    public ResponseEntity<Usuario> actualizarUsuario(@RequestBody Usuario user){
        userServ.crearUsuario(user);
        return new ResponseEntity(HttpStatus.OK);
    }

}
