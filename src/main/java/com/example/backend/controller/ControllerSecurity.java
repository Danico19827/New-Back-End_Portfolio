package com.example.backend.controller;

import com.example.backend.model.Security;
import com.example.backend.service.ISecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin(origins = "http://localhost:4200 , https://backend-portfolio-g40i.onrender.com")
@RequestMapping("auth")
public class ControllerSecurity {

    @Autowired
    private ISecurityService secServ;

    @GetMapping("/find/{id}")
    @ResponseBody
    public Security verUsuario(@PathVariable int id) {
        Security sec = secServ.buscarAuth(id);
        return sec;
    }

    @PutMapping("/actualizar")
    public ResponseEntity<Security> actualizarUsuario(@RequestBody Security sec) {
        secServ.crearAuth(sec);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/verificar")
    public ResponseEntity<Security> verificar() {
        if (((secServ.buscarAuth(1).getUser().equals(secServ.buscarAuth(2).getUser())) && (secServ.buscarAuth(1).getPassword().equals(secServ.buscarAuth(2).getPassword())))) {
            Security sec = secServ.buscarAuth(2);
            sec.setCoincide(true);
            secServ.crearAuth(sec);
            return new ResponseEntity(true,HttpStatus.OK);
        } else {
            Security sec2 = secServ.buscarAuth(2);
            sec2.setCoincide(false);
            secServ.crearAuth(sec2);
            return new ResponseEntity(false,HttpStatus.OK);
        }
    }

}
