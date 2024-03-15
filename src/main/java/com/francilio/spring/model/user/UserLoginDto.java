package com.francilio.spring.model.user;

import jakarta.validation.constraints.Size;

public record UserLoginDto (
        String name,
        @Size(min = 6, message = "O campo deve ter no mínimo 6 caracteres") String password
){
}
