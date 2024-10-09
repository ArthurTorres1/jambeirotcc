package com.example.tccjambeiro.jambeirotcc.usuario;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
@CrossOrigin("*")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping("/get")
    public ResponseEntity getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
    }
}
