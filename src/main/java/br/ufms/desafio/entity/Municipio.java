package br.ufms.desafio.entity;

import br.ufms.desafio.entity.generic.GenericEntity;
import br.ufms.desafio.enumeration.UF;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */

@Entity
@Table(name = "tb_municipio")
public class Municipio extends GenericEntity<Long> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "codigo_ibge")
    private Long codigoIbge;

    @Column(name = "nome")
    @Size(min = 1,max = 64)
    @NotNull
    private String nome;

    @Column(name = "uf")
    @NotNull
    private UF tipoUF;

    @OneToMany(mappedBy = "municipio")
    private List<Endereco> enderecos;

    public Municipio(){

    }

    public void setId(Long codigoIbge) {
        this.codigoIbge = codigoIbge;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public UF getTipoUF() {
        return tipoUF;
    }

    public void setTipoUF(UF tipoUF) {
        this.tipoUF = tipoUF;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public Long getId() {
        return codigoIbge;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoIbge != null ? codigoIbge.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Municipio)) {
            return false;
        }
        Municipio other = (Municipio) object;
        return !((this.codigoIbge == null && other.codigoIbge != null)
                || (this.codigoIbge != null && !this.codigoIbge.equals(other.codigoIbge)));
    }

    @Override
    public String toString() {
        return getClass().toString() + "[codigoIbge=" + codigoIbge + "]";
    }
}
