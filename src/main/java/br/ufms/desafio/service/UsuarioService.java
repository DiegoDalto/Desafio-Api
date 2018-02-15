package br.ufms.desafio.service;

import br.ufms.desafio.entity.Usuario;
import br.ufms.desafio.repository.UsuarioRepository;

import java.util.Date;
import java.util.List;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */
public class UsuarioService<E extends Usuario, DAO extends UsuarioRepository<E>> extends GenericService<E, DAO> {

    public List<E> findByNome(String nome) {
        return db.findByNome(nome);
    }

    public List<E> findByEmail(String email) {
        return db.findByEmail(email);
    }

    public List<E> findByUsuario(String usuario) {
        return db.findByUsuario(usuario);
    }

    public List<E> findByDataCriacao(Date criacao) {
        return db.findByDataCriacao(criacao);
    }
}