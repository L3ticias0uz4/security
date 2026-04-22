package com.example.security.controller;

import com.example.security.DTO.UsuarioRequestDTO;
import com.example.security.services.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }


    @PostMapping("/users")
    public ResponseEntity<?> criarUsuario(@RequestBody UsuarioRequestDTO dto){
        return ResponseEntity.ok(usuarioService.criarUsuario(dto));
    }

    @GetMapping("/admin")
    public String admin(){
        return"Acesso ADMIN";
    }

}
