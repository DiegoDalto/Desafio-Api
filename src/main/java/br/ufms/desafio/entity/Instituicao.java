package br.ufms.desafio.entity;

import br.ufms.desafio.enumeration.TipoInstituicao;
import br.ufms.desafio.enumeration.TipoUsuario;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */
@Entity
@Table(name = "tb_instituicao")
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
public class Instituicao extends Usuario {

    private static final long serialVersionUID = 1L;

    @Column(name = "tipo")
    @NotNull
    @Enumerated(EnumType.STRING)
    private TipoInstituicao tipoInstituicao;

    @ManyToMany(mappedBy = "instituicoes")
    private List<Professor> professores;

    /**
     * Construtor da classe.
     */
    public Instituicao() {
        this.setTipoUsuario(TipoUsuario.INSTITUICAO);
    }

    public TipoInstituicao getTipoInstituicao() {
        return tipoInstituicao;
    }

    public void setTipoInstituicao(TipoInstituicao tipoInstituicao) {
        this.tipoInstituicao = tipoInstituicao;
    }

    @JsonIgnore
    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }
}
