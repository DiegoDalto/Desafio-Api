package br.ufms.desafio.entity;

import br.ufms.desafio.enumeration.TipoUsuario;
import br.ufms.desafio.enumeration.Titulacao;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */

@Entity
@Table(name = "tb_professor")
@PrimaryKeyJoinColumn(name = "id")
public class Professor extends Jogador {

    private static final long serialVersionUID = 1L;

    @Column(name = "titulacao")
    @Enumerated(EnumType.STRING)
    private Titulacao titulacao;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "tb_instituicao_professor",
            joinColumns = @JoinColumn(name = "professor_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "instituicao_id", referencedColumnName = "id"))
    private Collection<Instituicao> instituicoes;

    @OneToMany(mappedBy = "professor", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<Turma> turmas;

    /**
     * Construtor
     */
    public Professor() {
        this.setTipoUsuario(TipoUsuario.PROFESSOR);
    }

//    public void addInstituicao(Instituicao instituicao) {
//        instituicoes.add(instituicao);
//    }
//
//    public void removeInstituicao(Instituicao instituicao) {
//        instituicoes.remove(instituicao);
//    }

    /**
     * Adiciona uma turma a este professor.
     *
     * @param turma
     */
    public void addTurma(Turma turma) {
        turmas.add(turma);
        turma.setProfessor(this);
    }

    /**
     * Remove a turma deste professor.
     *
     * @param turma
     */
    public void removeTelefone(Turma turma) {
        turmas.remove(turma);
        turma.setProfessor(null);
    }

    public Titulacao getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(Titulacao titulacao) {
        this.titulacao = titulacao;
    }

    public Collection<Instituicao> getInstituicaos() {
        return instituicoes;
    }

    public void setInstituicaos(Collection<Instituicao> instituicaos) {
        this.instituicoes = instituicaos;
    }

    @JsonIgnore
    public Collection<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(Collection<Turma> turmas) {
        this.turmas = turmas;
    }
}
