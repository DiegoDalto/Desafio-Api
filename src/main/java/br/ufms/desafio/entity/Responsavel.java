package br.ufms.desafio.entity;

import br.ufms.desafio.enumeration.TipoUsuario;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */

@Entity
@PrimaryKeyJoinColumn(name="id")
@Table(name = "tb_responsavel")
public class Responsavel extends Usuario implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "cpf")
    @Size(min = 11, max = 11)
    @NotNull
    private String cpf;

    @OneToOne(fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "id", referencedColumnName = "id")
    @MapsId
    private Usuario usuario;

    @ManyToMany(mappedBy = "responsaveis")
    private List<Aluno> alunos;

    public Responsavel(){
        this.setTipoUsuario(TipoUsuario.RESPONSAVEL);
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
}
