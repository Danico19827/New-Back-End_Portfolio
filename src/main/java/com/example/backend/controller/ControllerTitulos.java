
package com.example.backend.controller;

import com.example.backend.model.Titulos;
import com.example.backend.service.ITitulosService;
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
@CrossOrigin(origins = "http://localhost:4200 , https://backend-portfolio-g40i.onrender.com")
@RequestMapping("titulos")
public class ControllerTitulos {
    
    @Autowired
    private ITitulosService titulosServ;

    @PostMapping("/new/titulo")
    public ResponseEntity<Titulos> agregarTitulo(@RequestBody Titulos titulo) {
        titulosServ.crearTitulo(titulo);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/lista")
    @ResponseBody
    public List<Titulos> verTitulos() {
        return titulosServ.mostrarTitulos();
    }

    @DeleteMapping("/pop/{id}")
    public void eliminarTitulo(@PathVariable Long id) {
        titulosServ.borrarTitulo(id);
    }

    @GetMapping("/find/{id}")
    @ResponseBody
    public Titulos buscarTitulo(@PathVariable long id) {
        Titulos titulo = titulosServ.buscarTitulo(id);
        return titulo;
    }
    
    @PutMapping("/actualizar")
    public ResponseEntity<Titulos> actualizarTitulo(@RequestBody Titulos titulo){
        titulosServ.crearTitulo(titulo);
        return new ResponseEntity(HttpStatus.OK);
    }
}
