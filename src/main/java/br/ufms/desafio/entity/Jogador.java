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
@Inheritance(strategy = InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
public class Jogador extends Usuario {

    private static final long serialVersionUID = 1L;

    @Column(name = "data_nascimento")
    @NotNull
    private Date dataNascimento;

    // TODO: Ver como grava SET no banco de dados usando estas annotations.
    //@Column(name = "deficiencias")
    //@OneToMany(mappedBy = "jogador", cascade = CascadeType.ALL, orphanRemoval = true)
    //private Set<TipoDeficiencia> deficiencias;

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

//    @JsonIgnore
//    public String getTipoDeficiencia() {
//        return deficiencias.toString();
//    }

    public void setTipoDeficiencia(String tipoDeficiencia) {
    }
}
