package br.ufms.desafio.entity;

import br.ufms.desafio.enumeration.NivelEnsino;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */

@Entity
@Table(name = "tb_serie")
public class Serie extends Entidade implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    private Long aluno_id;

    @Column(name = "ano")
    @NotNull
    private Short ano;

    @Column(name = "nivel")
    @NotNull
    @Enumerated(EnumType.STRING)
    private NivelEnsino nivel;

    public Serie(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAluno_id() {
        return aluno_id;
    }

    public void setAluno_id(Long aluno_id) {
        this.aluno_id = aluno_id;
    }

    public Short getAno() {
        return ano;
    }

    public void setAno(Short ano) {
        this.ano = ano;
    }

    public NivelEnsino getNivel() {
        return nivel;
    }

    public void setNivel(NivelEnsino nivel) {
        this.nivel = nivel;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Serie)) {
            return false;
        }
        Serie other = (Serie) object;
        return !((this.id == null && other.id != null)
                || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return getClass().toString() + "[id=" + id + "]";
    }
}
