package com.example.security.controller;

import com.example.security.DTO.LoginDTO;
import com.example.security.services.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    JwtService jwtService;
    private AuthenticationManager authManager;
    @PostMapping("/login")
    public String login(@RequestBody LoginDTO loginDTO){
        authManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginDTO.getEmail(),
                        loginDTO.getSenha()
                )
        );
        return jwtService.gerarToken(loginDTO.getEmail());
    }

}
