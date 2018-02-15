package br.ufms.desafio.entity;

import br.ufms.desafio.enumeration.Periodo;
import br.ufms.genericlib.domain.GenericEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */

@Entity
@Table(name = "tb_turma")
public class Turma extends GenericEntity<Long> {

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

    @Override
    public Long getId() {
        return null;
    }
}
