package com.github.hadesfranklyn.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.hadesfranklyn.project.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
