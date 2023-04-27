
package com.example.backend.controller;

import com.example.backend.model.Proyectos;
import com.example.backend.service.IProyectosService;
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
@CrossOrigin(origins = "http://localhost:4200 , https://host-portfolio-cb3d2.web.app")
@RequestMapping("proyectos")
public class ControllerProyectos {
    
    
    @Autowired
    private IProyectosService proyectServ;

    @PostMapping("/new/proyecto")
    public ResponseEntity<Proyectos> agregarProyecto(@RequestBody Proyectos proyecto) {
        proyectServ.crearProyecto(proyecto);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/lista")
    @ResponseBody
    public List<Proyectos> verProyectos() {
        return proyectServ.mostrarProyectos();
    }

    @DeleteMapping("/pop/{id}")
    public void eliminarProyecto(@PathVariable Long id) {
        proyectServ.borrarProyecto(id);
    }

    @GetMapping("/find/{id}")
    @ResponseBody
    public Proyectos buscarProyecto(@PathVariable long id) {
        Proyectos proyect = proyectServ.buscarProyecto(id);
        return proyect;
    }
    
    @PutMapping("/actualizar")
    public ResponseEntity<Proyectos> actualizarProyecto(@RequestBody Proyectos proyect){
        proyectServ.crearProyecto(proyect);
        return new ResponseEntity(HttpStatus.OK);
    }

    
}
