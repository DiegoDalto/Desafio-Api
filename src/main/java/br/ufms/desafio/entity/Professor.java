package br.ufms.desafio.entity;

import br.ufms.desafio.enumeration.TipoUsuario;
import br.ufms.desafio.enumeration.Titulacao;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */

@Entity
@PrimaryKeyJoinColumn(name="id")
@Table(name = "tb_professor")
public class Professor extends Jogador {

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

    public List<Instituicao> getInstituicao() {
        return instituicaos;
    }

    public void setInstituicao(List<Instituicao> instituicaos){
        this.instituicaos = instituicaos;
    }
}
