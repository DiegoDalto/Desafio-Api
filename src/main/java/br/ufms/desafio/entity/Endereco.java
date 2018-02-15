package br.ufms.desafio.entity;

import br.ufms.genericlib.domain.GenericEntity;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */

@Entity
@Table(name = "tb_endereco")
public class Endereco extends GenericEntity<Long> {

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

    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }
}
