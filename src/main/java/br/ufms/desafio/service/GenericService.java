package br.ufms.desafio.service;

import br.ufms.desafio.entity.Entidade;
import br.ufms.desafio.repository.HibernateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */
public class GenericService <E extends Entidade, DAO extends HibernateRepository<E>> {

    @Autowired
    protected DAO db;

    @Transactional(rollbackFor = Exception.class)
    public void save(E entity) {
        db.saveOrUpdate(entity);
    }

    @Transactional(rollbackFor = Exception.class)
    public void delete(E entity) {
        db.delete(entity);
    }

    @Transactional(rollbackFor = Exception.class)
    public void delete(Serializable id) {
        db.delete(db.get(id));
    }

    public E get(Serializable id) {
        return db.get(id);
    }

    public List<E> getAll() {
        return db.getAll();
    }
}
