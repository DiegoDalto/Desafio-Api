package br.ufms.desafio.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */

@Entity
@Table(name = "tb_endereco")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "Endereco.findAll", query = "SELECT e FROM Endereco e"),
        @NamedQuery(name = "Endereco.findById", query = "SELECT e FROM Endereco e WHERE e.id = :id"),
        @NamedQuery(name = "Endereco.findByLogradouro", query = "SELECT e FROM Endereco e WHERE e.logradouro = :logradouro"),
        @NamedQuery(name = "Endereco.findByNumero", query = "SELECT e FROM Endereco e WHERE e.numero = :numero"),
        @NamedQuery(name = "Endereco.findBySemNumero", query = "SELECT e FROM Endereco e WHERE e.sn = :sn"),
        @NamedQuery(name = "Endereco.findByComplemento", query = "SELECT e FROM Endereco e WHERE e.complemento = :complemento"),
        @NamedQuery(name = "Endereco.findByBairro", query = "SELECT e FROM Endereco e WHERE e.bairro = :bairro"),
        @NamedQuery(name = "Endereco.findByCep", query = "SELECT e FROM Endereco e WHERE e.cep = :cep")
})
public class Endereco extends Entidade implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "logradouro")
    @Size(min = 1,max = 128)
    private String logradouro;

    @Column(name = "numero")
    @Size(min = 1,max = 4)
    private Short numero;

    @Column(name = "s_n")
    private Boolean semNumero;

    @Column(name = "complemento")
    @Size(min = 1,max = 64)
    private String complemento;

    @Column(name = "bairro")
    private String bairro;

    @Column(name = "cep")
    @Size(min = 9,max = 9)
    private String cep;

    @ManyToOne(optional = false)
    @JoinColumn(name = "codigo_municipio", referencedColumnName = "codigo_ibge")
    private Municipio municipio;

    @OneToOne(fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "id", referencedColumnName = "id")
    @MapsId
    private Usuario usuario;

    public Endereco(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Short getNumero() {
        return numero;
    }

    public void setNumero(Short numero) {
        this.numero = numero;
    }

    public Boolean getSemNumero() {
        return semNumero;
    }

    public void setSemNumero(Boolean semNumero) {
        this.semNumero = semNumero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Endereco)) {
            return false;
        }
        Endereco other = (Endereco) object;
        return !((this.id == null && other.id != null)
                || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return getClass().toString() + "[id=" + id + "]";
    }
}
