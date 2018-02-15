package br.ufms.desafio.repository;

import br.ufms.desafio.entity.Entidade;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */
@SuppressWarnings("unchecked")
public class HibernateRepository<E extends Entidade> {

    protected Class<E> clazz;
    protected Session session;

    @Autowired
    private SessionFactory sessionFactory;

    /**
     * @param clazz
     */
    public HibernateRepository(Class<E> clazz) {
        this.clazz = clazz;
    }

    /**
     * @param entity
     */
    public void save(E entity) {
        getSession().save(entity);
    }

    /**
     * @param entity
     */
    public void update(E entity) {
        getSession().update(entity);
    }

    /**
     * @param entity
     */
    public void saveOrUpdate(E entity) {
        getSession().saveOrUpdate(entity);
    }

    /**
     * @param entity
     */
    public void delete(E entity) {
        getSession().delete(entity);
    }

    /**
     * @param id
     * @return
     */
    public E load(Serializable id) {
        return (E) getSession().load(this.clazz, id);
    }

    /**
     * @param id
     * @return
     */
    public E get(Serializable id) {
        return (E) getSession().get(this.clazz, id);
    }

    /**
     * @return
     */
    public List<E> getAll() {
        return getSession().createQuery("FROM " + clazz.getName()).list();
    }

    /**
     * @param query
     * @return
     */
    protected Query createQuery(String query) {
        return getSession().createQuery(query);
    }

    /**
     * @return
     */
    protected Criteria createCriteria() {
        return getSession().createCriteria(this.clazz);
    }

    /**
     * @param sessionFactory
     */
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    /**
     * @return
     */
    public Session getSession() {
        if (sessionFactory != null) {
            session = sessionFactory.getCurrentSession();
        }
        if (session == null) {
            throw new RuntimeException("Hibernate session is null");
        }
        return session;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}