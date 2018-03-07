package br.ufms.desafio.entity;

import br.ufms.desafio.enumeration.TipoInstituicao;
import br.ufms.desafio.enumeration.TipoUsuario;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Collection;

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
    private Collection<Professor> professores;

    @OneToMany(mappedBy = "instituicao")
    private Collection<Aluno> alunos;

    /**
     * Construtor da classe.
     */
    public Instituicao() {
        this.setTipoUsuario(TipoUsuario.INSTITUICAO);
    }

//    public void addProfessor(Professor professor){
//        professores.add(professor);
//    }
//
//    public void removeProfessor(Professor professor){
//        professores.remove(professor);
//    }

    public TipoInstituicao getTipoInstituicao() {
        return tipoInstituicao;
    }

    public void setTipoInstituicao(TipoInstituicao tipoInstituicao) {
        this.tipoInstituicao = tipoInstituicao;
    }

    @JsonIgnore
    public Collection<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(Collection<Professor> professores) {
        this.professores = professores;
    }

    @JsonIgnore
    public Collection<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(Collection<Aluno> alunos) {
        this.alunos= alunos;
    }
}
