package br.ufms.desafio.repository;

import br.ufms.desafio.entity.Jogador;
import org.hibernate.Query;

import java.util.Date;
import java.util.List;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */
@SuppressWarnings("unchecked")
public class JogadorRepository<E extends Jogador> extends  UsuarioRepository<E> {

    public JogadorRepository(Class<E> clazz) {
        super(clazz);
    }

    public List<E> findByDataNascimento(Date data_nascimento) {
        Query q = getSession().createQuery("FROM Jogador WHERE data_nascimento = ?");
        q.setDate(0, data_nascimento);
        return q.list();
    }
}