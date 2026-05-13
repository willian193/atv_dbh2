package com.example.atv_dbh2.service;

import com.example.atv_dbh2.model.usuarioGamer;
import com.example.atv_dbh2.repository.usuarioGamerRepository;
import jakarta.persistence.Id;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class usuarioGamerService {

    private final usuarioGamerRepository repository;

    public List<usuarioGamer> listar(){
        return repository.findAll();
    }

    public usuarioGamer buscar(Long id){
        return repository.findById(id)
                .orElseThrow(()-> new RuntimeException("Usuario gamer não encontrado"));

    }
    public usuarioGamer salvar (usuarioGamer usuario){
        return repository.save(usuario);
    }

    public usuarioGamer atualizar(Long id , usuarioGamer dados){
        usuarioGamer usuario = buscar(id);
            usuario.setEmail(dados.getEmail());
            usuario.setNickname(dados.getNickname());
            usuario.setNivel(dados.getNivel());
            return repository.save(usuario);
    }
    public void excluir(Long id){
        repository.deleteById(id);
    }
}
