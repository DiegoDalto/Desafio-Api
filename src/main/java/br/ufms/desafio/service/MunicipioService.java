package br.ufms.desafio.service;

import br.ufms.desafio.entity.Municipio;
import br.ufms.desafio.repository.MunicipioRepository;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */
@Component
public class MunicipioService extends GenericService<Municipio, MunicipioRepository>{

    public List<Municipio> findByName(String name) {
        return db.findByName(name);
    }

    public List<Municipio> findByUF(String uf) {
        return db.findByUF(uf);
    }
}
