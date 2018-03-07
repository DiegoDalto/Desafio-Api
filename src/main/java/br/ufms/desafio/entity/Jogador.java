package br.ufms.desafio.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */

@Entity
@Table(name = "tb_jogador")
//@Inheritance(strategy = InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
public class Jogador extends Usuario {

    private static final long serialVersionUID = 1L;

    @Column(name = "data_nascimento")
    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    private Date dataNascimento;

    //@Column(name = "deficiencias")
    //@OneToMany(mappedBy = "jogador", cascade = CascadeType.ALL, orphanRemoval = true)
    //private Collection<TipoDeficiencia> deficiencia;

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
