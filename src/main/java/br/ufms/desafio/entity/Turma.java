package br.ufms.desafio.entity;

import br.ufms.desafio.entity.generic.GenericEntity;
import br.ufms.desafio.enumeration.Periodo;

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
@Table(name = "tb_turma")
public class Turma extends GenericEntity<Long> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    @NotNull
    @Size(min = 1, max = 64)
    private String nome;

    @Column(name = "periodo")
    @Enumerated(EnumType.STRING)
    private Periodo periodo;

    @ManyToOne(optional = false)
    @JoinColumn(name = "instituicao_id", referencedColumnName = "id")
    private Instituicao instituicao;

    @ManyToMany(mappedBy = "turmas")
    private List<Aluno> alunos;

    @ManyToOne(optional = false)
    @JoinColumn(name = "professor_id", referencedColumnName = "id")
    private Professor professor;

    public Turma() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public Instituicao getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(Instituicao instituicao) {
        this.instituicao = instituicao;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Turma)) {
            return false;
        }
        Turma other = (Turma) object;
        return !((this.id == null && other.id != null)
                || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return getClass().toString() + "[id=" + id + "]";
    }
}
