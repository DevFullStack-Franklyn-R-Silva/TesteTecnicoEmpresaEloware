package com.github.hadesfranklyn.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.hadesfranklyn.project.model.Endereco;
import com.github.hadesfranklyn.project.model.Pessoa;
import com.github.hadesfranklyn.project.repositories.EnderecoRepository;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public Endereco criarEndereco(Long pessoaId, Endereco endereco) {
        Pessoa pessoa = new Pessoa();
        pessoa.setId(pessoaId);
        endereco.setPessoa(pessoa);
        return enderecoRepository.save(endereco);
    }

    public Endereco editarEndereco(Long id, Endereco endereco) {
        if (enderecoRepository.existsById(id)) {
            endereco.setId(id);
            return enderecoRepository.save(endereco);
        } else {
            throw new RuntimeException("Endereço não encontrado com o ID: " + id);
        }
    }

    public Endereco consultarEndereco(Long id) {
        return enderecoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Endereço não encontrado com o ID: " + id));
    }
}