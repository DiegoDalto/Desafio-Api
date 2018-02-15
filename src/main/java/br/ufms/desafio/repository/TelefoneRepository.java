package br.ufms.desafio.repository;

import br.ufms.desafio.entity.Telefone;
import org.springframework.stereotype.Component;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */
@Component
@SuppressWarnings("unchecked")
public class TelefoneRepository extends HibernateRepository<Telefone>{

    public TelefoneRepository() {
        super(Telefone.class);
    }
}