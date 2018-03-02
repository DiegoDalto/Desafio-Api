package br.ufms.desafio.entity;

import br.ufms.desafio.enumeration.TipoUsuario;
import br.ufms.desafio.enumeration.Titulacao;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */

@Entity
@PrimaryKeyJoinColumn(name="id")
@Table(name = "tb_professor")
public class Professor extends Jogador implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "titulacao")
    @Enumerated(EnumType.STRING)
    private Titulacao titulacao;

    @ManyToMany(mappedBy = "professores")
    private List<Instituicao> instituicaos;

    @OneToMany(mappedBy = "professor")
    private List<Turma> turmas;

    @OneToOne(fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "id", referencedColumnName = "professor_id")
    @MapsId
    private Responsavel responsavel;

    /*Construtor*/
    public Professor(){
        this.setTipoUsuario(TipoUsuario.PROFESSOR);
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Titulacao getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(Titulacao titulacao) {
        this.titulacao = titulacao;
    }

    public List<Instituicao> getInstituicaos() {
        return instituicaos;
    }

    public void setInstituicaos(List<Instituicao> instituicaos) {
        this.instituicaos = instituicaos;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }
}
