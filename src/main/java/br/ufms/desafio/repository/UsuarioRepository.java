package br.ufms.desafio.repository;

import br.ufms.desafio.entity.Usuario;
import org.hibernate.Query;

import java.util.Date;
import java.util.List;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */
@SuppressWarnings("unchecked")
public class UsuarioRepository<E extends Usuario> extends HibernateRepository<E> {

    public UsuarioRepository(Class<E> clazz) {
        super(clazz);
    }

    public List<E> findByNome(String nome) {
        Query q = getSession().createQuery("FROM Usuario WHERE LOWER(nome) LIKE LOWER(?)");
        q.setString(0, "%" + nome + "%");
        return q.list();
    }

    public List<E> findByEmail(String email) {
        Query q = getSession().createQuery("FROM Usuario WHERE LOWER(email) LIKE LOWER(?)");
        q.setString(0, "%" + email + "%");
        return q.list();
    }

    public List<E> findByUsuario(String usuario) {
        Query q = getSession().createQuery("FROM Usuario WHERE LOWER(usuario) LIKE LOWER(?)");
        q.setString(0, "%" + usuario + "%");
        return q.list();
    }

    public List<E> findByDataCriacao(Date criacao) {
        Query q = getSession().createQuery("FROM Usuario WHERE criacao = ?");
        q.setDate(0, criacao);
        return q.list();
    }
}