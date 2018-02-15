package br.ufms.desafio.entity;

import br.ufms.desafio.enumeration.TipoInstituicao;
import br.ufms.desafio.enumeration.TipoUsuario;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */

@Entity
@PrimaryKeyJoinColumn(name="id")
@Table(name = "tb_instituicao")
public class Instituicao extends Usuario{

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

    public List<Professor> getProfessores(){
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    public TipoInstituicao getTipoInstituicao() {
        return tipoInstituicao;
    }

    public void setTipoInstituicao(TipoInstituicao tipoInstituicao) {
        this.tipoInstituicao = tipoInstituicao;
    }

//    public Collection<Usuario> getUsuarios() {
//        return usuarios;
//    }
//
//    public void setUsuarios(List<Usuario> usuarios) {
//        this.usuarios = usuarios;
//    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
}
