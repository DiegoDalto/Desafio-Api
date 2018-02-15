package br.ufms.desafio.service;

import br.ufms.desafio.entity.Aluno;
import br.ufms.desafio.repository.AlunoRepository;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */
@Component
public class AlunoService extends JogadorService<Aluno, AlunoRepository>{

    public List<Aluno> findByNome(String nome) {
        return db.findByNome(nome);
    }
}
