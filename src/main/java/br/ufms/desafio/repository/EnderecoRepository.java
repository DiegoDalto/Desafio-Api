package br.ufms.desafio.repository;

import br.ufms.desafio.entity.Endereco;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */
@Component
@SuppressWarnings("unchecked")
public class EnderecoRepository extends HibernateRepository<Endereco> {

    public EnderecoRepository() {
        super(Endereco.class);
    }

    public List<Endereco> findByLogradouro(String logradouro) {
        org.hibernate.Query q = getSession().createQuery("FROM Endereco WHERE LOWER(logradouro) LIKE LOWER(?)");
        q.setString(0, "%" + logradouro + "%");
        return q.list();
    }

    public List<Endereco> findByNumero(int numero) {
        org.hibernate.Query q = getSession().createQuery("FROM Endereco WHERE numero = ?");
        q.setInteger(0, numero);
        return q.list();
    }

    public List<Endereco> findBySemNumero(boolean sn) {
        org.hibernate.Query q = getSession().createQuery("FROM Endereco WHERE sn = ?");
        q.setBoolean(0, sn);
        return q.list();
    }

    public List<Endereco> findByComplemento(String complemento) {
        org.hibernate.Query q = getSession().createQuery("FROM Endereco WHERE LOWER(complemento) LIKE LOWER(?)");
        q.setString(0, "%" + complemento + "%");
        return q.list();
    }

    public List<Endereco> findByBairro(String bairro) {
        org.hibernate.Query q = getSession().createQuery("FROM Endereco WHERE LOWER(bairro) LIKE LOWER(?)");
        q.setString(0, "%" + bairro + "%");
        return q.list();
    }

    public List<Endereco> findByCep(String cep) {
        org.hibernate.Query q = getSession().createQuery("FROM Endereco WHERE numero = ?");
        q.setString(0, cep);
        return q.list();
    }
}
