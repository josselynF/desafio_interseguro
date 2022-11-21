package com.example.desafio.controller;

import com.example.desafio.exception.Excepciones;
import com.example.desafio.service.DesafioService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v1/api")
public class DesafioController {
    private final DesafioService service;

    public DesafioController(DesafioService service) {
        this.service = service;
    }

    @PostMapping("/ejecutar")
    public ResponseEntity<int[][]> ejecutar(@RequestBody int[][] array) throws Excepciones {
        return ResponseEntity.ok(service.ejecutar(array));
    }
}
