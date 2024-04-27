package com.github.hadesfranklyn.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.hadesfranklyn.project.model.Endereco;
import com.github.hadesfranklyn.project.model.Pessoa;
import com.github.hadesfranklyn.project.repositories.PessoaRepository;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Transactional
    public Pessoa criarPessoa(Pessoa pessoa) {
        for (Endereco endereco : pessoa.getEnderecos()) {
            endereco.setPessoa(pessoa);
        }
        return pessoaRepository.save(pessoa);
    }
    @Transactional
    public Pessoa editarPessoa(Long id, Pessoa pessoa) {
        if (pessoaRepository.existsById(id)) {
            pessoa.setId(id);
            return pessoaRepository.save(pessoa);
        } else {
            throw new RuntimeException("Pessoa não encontrada com o ID: " + id);
        }
    }

    @Transactional(readOnly = true)
    public Pessoa consultarPessoa(Long id) {
        return pessoaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pessoa não encontrada com o ID: " + id));
    }
    
    @Transactional(readOnly = true)
    public List<Pessoa> consultarTodasPessoas() {
        return pessoaRepository.findAll();
    }
    
    @Transactional
    public void deletarPessoa(Long id) {
        pessoaRepository.deleteById(id);
    }
}