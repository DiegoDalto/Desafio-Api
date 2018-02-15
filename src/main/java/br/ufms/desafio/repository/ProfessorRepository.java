package br.ufms.desafio.repository;

import br.ufms.desafio.entity.Professor;
import org.springframework.stereotype.Component;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */
@Component
@SuppressWarnings("unchecked")
public class ProfessorRepository extends JogadorRepository<Professor> {

    public ProfessorRepository() {
        super(Professor.class);
    }
}