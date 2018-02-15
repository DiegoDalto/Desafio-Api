package br.ufms.desafio.entity;

import br.ufms.desafio.enumeration.TipoInstituicao;
import br.ufms.desafio.enumeration.TipoUsuario;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */

@Entity
@PrimaryKeyJoinColumn(name="id")
@Table(name = "tb_instituicao")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "Instituicao.findAll", query = "SELECT e FROM Instituicao e"),
        @NamedQuery(name = "Instituicao.findById", query = "SELECT e FROM Instituicao e WHERE e.id = :id"),
        @NamedQuery(name = "Instituicao.findByTipo", query = "SELECT e FROM Instituicao e WHERE e.tipo = :tipo")
})
public class Instituicao extends Usuario implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "tipo")
    @NotNull
    @Enumerated(EnumType.STRING)
    private TipoInstituicao tipoInstituicao;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "tb_instituicao_professor", joinColumns = @JoinColumn(name = "instituicao_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "professor_id", referencedColumnName = "id"))
    private List<Professor> professores;

    @OneToOne(fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "id", referencedColumnName = "id")
    @MapsId
    private Usuario usuario;

    @OneToMany(mappedBy = "instituicao")
    private List<Aluno> alunos;

    @OneToMany(mappedBy = "instituicao")
    private List<Turma> turmas;

    /*Construtor*/
    public Instituicao(){
        this.setTipoUsuario(TipoUsuario.INSTITUICAO);
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public TipoInstituicao getTipoInstituicao() {
        return tipoInstituicao;
    }

    public void setTipoInstituicao(TipoInstituicao tipoInstituicao) {
        this.tipoInstituicao = tipoInstituicao;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }
}
