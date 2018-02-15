package br.ufms.desafio.service;

import br.ufms.desafio.entity.Jogador;
import br.ufms.desafio.repository.JogadorRepository;

import java.util.Date;
import java.util.List;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */
public class JogadorService<E extends Jogador, DAO extends JogadorRepository<E>>
        extends GenericService<E, DAO> {

    public List<E> findByDataNascimento(Date nascimento) {
        return db.findByDataNascimento(nascimento);
    }
}