package br.ufms.desafio.entity;

import br.ufms.spbootlib.domain.GenericEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */

@Entity
@Table(name = "tb_municipio")
public class Municipio extends GenericEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "codigo_ibge")
    @NotNull
    private Long codigoIbge;

    @Column(name = "nome")
    @Size(min = 1, max = 64)
    @NotNull
    private String nome;

    @Column(name = "uf")
    @Size(min = 2, max = 2)
    @NotNull
    private String tipoUF;

    public void setId(Long codigoIbge) {
        this.codigoIbge = codigoIbge;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoUF() {
        return tipoUF;
    }

    public void setTipoUF(String tipoUF) {
        this.tipoUF = tipoUF;
    }

    public Long getId() {
        return codigoIbge;
    }

//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (codigoIbge != null ? codigoIbge.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        if (!(object instanceof Municipio)) {
//            return false;
//        }
//        Municipio other = (Municipio) object;
//        return !((this.codigoIbge == null && other.codigoIbge != null)
//                || (this.codigoIbge != null && !this.codigoIbge.equals(other.codigoIbge)));
//    }
//
//    @Override
//    public String toString() {
//        return getClass().toString() + "[codigoIbge=" + codigoIbge + "]";
//    }
}
