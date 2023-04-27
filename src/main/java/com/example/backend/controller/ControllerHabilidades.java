package com.example.backend.controller;


import com.example.backend.model.Habilidades;
import com.example.backend.service.IHabilidadesService;
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
@CrossOrigin(origins = "http://localhost:4200 , https://backend-portfolio-g40i.onrender.com")
@RequestMapping("habilidades")
public class ControllerHabilidades {

    @Autowired
    private IHabilidadesService habServ;

    @PostMapping("/new/habilidad")
    public ResponseEntity<Habilidades> agregarHabilidad(@RequestBody Habilidades habilidad) {
        habServ.crearHabilidad(habilidad);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/lista")
    @ResponseBody
    public List<Habilidades> verHabilidades() {
        return habServ.mostrarHabilidades();
    }

    @DeleteMapping("/pop/{id}")
    public void eliminarHabilidad(@PathVariable Long id) {
        habServ.borrarHabilidad(id);
    }
    
    @GetMapping("/find/{id}")
    @ResponseBody
    public Habilidades buscarHabilidad(@PathVariable long id) {
        Habilidades hab = habServ.buscarHabilidad(id);
        return hab;
    }

    @PutMapping("/actualizar")
    public ResponseEntity<Habilidades> actualizarHabilidad(@RequestBody Habilidades habilidad){
        habServ.crearHabilidad(habilidad);
        return new ResponseEntity(HttpStatus.OK);
    }

}
