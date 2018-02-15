package br.ufms.desafio.repository;

import br.ufms.desafio.entity.Turma;
import org.springframework.stereotype.Component;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */
@Component
@SuppressWarnings("unchecked")
public class TurmaRepository extends HibernateRepository<Turma>{

    public TurmaRepository() {
        super(Turma.class);
    }
}