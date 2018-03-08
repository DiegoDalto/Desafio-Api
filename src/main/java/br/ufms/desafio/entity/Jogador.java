package br.ufms.desafio.entity;

import br.ufms.desafio.enumeration.TipoDeficiencia;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

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
    @Column(name = "deficiencias")
    private String deficiencias;

//    private Set<TipoDeficiencia> deficienciaSet = new HashSet<>();

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDeficiencias() {
        return deficiencias;
    }

    public void setDeficiencias(String deficiencias) {
        this.deficiencias = deficiencias;
    }

//    @JsonIgnore
//    public Set<TipoDeficiencia> getDeficienciasSet() {
//        deficienciaSet.clear();
//        String[] array = deficiencias.split(",");
//        for (String s : array) {
//            System.out.println(s);
//            deficienciaSet.add(TipoDeficiencia.valueOf(s));
//        }
//        return deficienciaSet;
//    }
}
