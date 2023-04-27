package com.example.backend.controller;

import com.example.backend.model.Educacion;
import com.example.backend.service.IEducacionService;
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
import org.springframework.web.bind.annotation.ResponseBody;




@Controller
@CrossOrigin(origins = "http://localhost:4200 , https://host-portfolio-cb3d2.web.app")
@RequestMapping("educacion")
public class ControllerEducacion {
    
    @Autowired
    private IEducacionService eduServ;

    @PostMapping("/new/educacion")
    public ResponseEntity<Educacion> agregarEducacion(@RequestBody Educacion edu) {
        eduServ.crearEducacion(edu);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/lista")
    @ResponseBody
    public List<Educacion> verEducacion() {
        return eduServ.mostrarEducacion();
    }
    
    @DeleteMapping("/pop/{id}")
    public void eliminarEducacion(@PathVariable int id) {
        eduServ.borrarEducacion(id);
    }

    @GetMapping("/find/{id}")
    @ResponseBody
    public Educacion buscarEducacion(@PathVariable int id) {
        Educacion edu = eduServ.buscarEducacion(id);
        return edu;
    }
    
    @PutMapping("/actualizar")
    public ResponseEntity<Educacion> actualizarEducacion(@RequestBody Educacion edu){
        eduServ.crearEducacion(edu);
        return new ResponseEntity(HttpStatus.OK);
    }
    
}
