package br.ufms.desafio.repository;

import br.ufms.desafio.entity.Serie;
import org.springframework.stereotype.Component;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */
@Component
@SuppressWarnings("unchecked")
public class SerieRepository extends HibernateRepository<Serie>{

    public SerieRepository() {
        super(Serie.class);
    }
}