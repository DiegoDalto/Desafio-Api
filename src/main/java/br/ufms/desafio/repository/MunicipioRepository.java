package br.ufms.desafio.repository;

import br.ufms.desafio.entity.Municipio;
import org.hibernate.Query;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */
@Component
@SuppressWarnings("unchecked")
public class MunicipioRepository extends  HibernateRepository<Municipio> {

    public MunicipioRepository() {
        super(Municipio.class);
    }

    /**
     * Busca um município pelo nome.
     */
    public List<Municipio> findByName(String nome) {
        Query q = getSession().createQuery("FROM Municipio WHERE LOWER(nome) LIKE LOWER(?)");
        q.setString(0, "%" + nome + "%");
        return q.list();
    }

    /**
     * Consulta os municípios de um estado
     */
    public List<Municipio> findByUF(String uf) {
        Query q = getSession().createQuery("FROM Municipio WHERE uf = ?");
        q.setString(0, uf);
        return q.list();
    }
}