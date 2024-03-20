package com.francilio.spring.controller;


import com.francilio.spring.infra.security.TokenService;
import com.francilio.spring.model.user.User;
import com.francilio.spring.model.user.UserAuthenticate;
import com.francilio.spring.model.user.UserLoginDto;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {


    @Autowired
    private AuthenticationManager authenticate;

    @Autowired
    private TokenService tokenService;


    @PostMapping
    public ResponseEntity efetuarLogin(@RequestBody UserLoginDto dados) {

        var authenticationToken = new UsernamePasswordAuthenticationToken(dados.name(), dados.password());
        var authentication = authenticate.authenticate(authenticationToken);
        var tokenJWT = tokenService.gerarToken((User) authentication.getPrincipal());

        return ResponseEntity.ok(new UserAuthenticate( Long.parseLong( tokenService.getSubject(tokenJWT).split(";")[1]), dados.name(), tokenJWT));

    }


}
