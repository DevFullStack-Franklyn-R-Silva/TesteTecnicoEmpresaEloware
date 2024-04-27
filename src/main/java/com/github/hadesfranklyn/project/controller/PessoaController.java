package com.github.hadesfranklyn.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.hadesfranklyn.project.model.Pessoa;
import com.github.hadesfranklyn.project.service.PessoaService;

@RestController
@RequestMapping("/api/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping("/criar")
    public Pessoa criarPessoa(@RequestBody Pessoa pessoa) {
        return pessoaService.criarPessoa(pessoa);
    }

    @PutMapping("/editar/{id}")
    public Pessoa editarPessoa(@PathVariable Long id, @RequestBody Pessoa pessoa) {
        return pessoaService.editarPessoa(id, pessoa);
    }

    @GetMapping("/{id}")
    public Pessoa consultarPessoa(@PathVariable Long id) {
        return pessoaService.consultarPessoa(id);
    }
}