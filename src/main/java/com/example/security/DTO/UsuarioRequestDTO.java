package com.example.security.DTO;

import com.example.security.enums.Role;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

@Data
public class UsuarioRequestDTO {

    private String nome;
    private String email;
    private String senha;

}
