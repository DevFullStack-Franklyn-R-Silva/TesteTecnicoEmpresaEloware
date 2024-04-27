package com.github.hadesfranklyn.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.hadesfranklyn.project.model.Endereco;
import com.github.hadesfranklyn.project.service.EnderecoService;

@RestController
@RequestMapping("/api/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @PostMapping("/criar/{pessoaId}")
    public Endereco criarEndereco(@PathVariable Long pessoaId, @RequestBody Endereco endereco) {
        return enderecoService.criarEndereco(pessoaId, endereco);
    }

    @PutMapping("/editar/{id}")
    public Endereco editarEndereco(@PathVariable Long id, @RequestBody Endereco endereco) {
        return enderecoService.editarEndereco(id, endereco);
    }

    @GetMapping("/{id}")
    public Endereco consultarEndereco(@PathVariable Long id) {
        return enderecoService.consultarEndereco(id);
    }
}