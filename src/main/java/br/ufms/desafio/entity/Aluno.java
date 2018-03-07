package br.ufms.desafio.entity;

import br.ufms.desafio.enumeration.TipoUsuario;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.Date;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */

@Entity
@Table(name = "tb_aluno")
@PrimaryKeyJoinColumn(name = "id")
public class Aluno extends Jogador {

    private static final long serialVersionUID = 1L;

    @Column(name = "data_inicio")
    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    private Date dataInicio;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "tb_turma_aluno", joinColumns = @JoinColumn(name = "turma_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "aluno_id", referencedColumnName = "id"))
    private Collection<Turma> turmas;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "tb_responsavel_aluno", joinColumns = @JoinColumn(name = "responsavel_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "aluno_id", referencedColumnName = "id"))
    private Collection<Responsavel> responsaveis;

    @OneToOne(fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "id", referencedColumnName = "aluno_id")
    @MapsId
    private Serie serie;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "instituicao_id", referencedColumnName = "id")
    //@MapsId
    private Instituicao instituicao;

    public Aluno() {
        this.setTipoUsuario(TipoUsuario.ALUNO);
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Collection<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(Collection<Turma> turmas) {
        this.turmas = turmas;
    }

    public Collection<Responsavel> getResponsaveis() {
        return responsaveis;
    }

    public void setResponsaveis(Collection<Responsavel> responsaveis) {
        this.responsaveis = responsaveis;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public Instituicao getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(Instituicao instituicao) {
        this.instituicao = instituicao;
    }
}
