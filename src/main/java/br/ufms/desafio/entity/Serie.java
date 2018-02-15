package br.ufms.desafio.entity;

import br.ufms.desafio.enumeration.NivelEnsino;
import br.ufms.genericlib.domain.GenericEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */

@Entity
@Table(name = "tb_serie")
public class Serie extends GenericEntity<Long>{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    private Long aluno_id;

    @Column(name = "ano")
    @NotNull
    private Short ano;

    @Column(name = "nivel")
    @NotNull
    @Enumerated(EnumType.STRING)
    private NivelEnsino nivel;

    public Serie(){
    }

    @Override
    public Long getId() {
        return null;
    }
}
