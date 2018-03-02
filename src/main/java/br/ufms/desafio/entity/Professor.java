package br.ufms.desafio.entity;

import br.ufms.desafio.enumeration.TipoUsuario;
import br.ufms.desafio.enumeration.Titulacao;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */

@Entity
@PrimaryKeyJoinColumn(name = "id")
@Table(name = "tb_professor")
public class Professor extends Jogador {

    private static final long serialVersionUID = 1L;

    @Column(name = "titulacao")
    @Enumerated(EnumType.STRING)
    private Titulacao titulacao;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "tb_instituicao_professor",
            joinColumns = @JoinColumn(name = "professor_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "instituicao_id", referencedColumnName = "id"))
    private List<Instituicao> instituicoes;

    @OneToMany(mappedBy = "professor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Turma> turmas;

    /**
     * Construtor
     */
    public Professor() {
        this.setTipoUsuario(TipoUsuario.PROFESSOR);
    }

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

    public List<Instituicao> getInstituicaos() {
        return instituicoes;
    }

    public void setInstituicaos(List<Instituicao> instituicaos) {
        this.instituicoes = instituicaos;
    }

    @JsonIgnore
    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }
}
