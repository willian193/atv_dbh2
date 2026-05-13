package com.example.atv_dbh2.controller;

import com.example.atv_dbh2.model.usuarioGamer;
import com.example.atv_dbh2.service.usuarioGamerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/Usuarios")
@RestController


public class usuarioGamerController {

    private final usuarioGamerService service;

    @GetMapping
    public List<usuarioGamer> listar(){
        return service.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<usuarioGamer> buscar(@PathVariable Long id){
        return ResponseEntity.ok(service.buscar(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<usuarioGamer> atualizar(
            @PathVariable Long id, @RequestBody usuarioGamer dados) {
        return ResponseEntity.ok(service.atualizar(id, dados));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id){
        service.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
