package br.ufms.desafio.entity;

import br.ufms.desafio.enumeration.TipoUsuario;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */

@Entity
@PrimaryKeyJoinColumn(name="id")
@Table(name = "tb_aluno")
public class Aluno extends Jogador {

        private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "id")
        private Long id;

        @Column(name = "data_inicio")
        private LocalDate dataInicio;

        @ManyToMany(cascade = CascadeType.ALL)
        @JoinTable(name = "tb_turma_aluno", joinColumns = @JoinColumn(name = "turma_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "aluno_id", referencedColumnName = "id"))
        private List<Turma> turmas;

        @ManyToMany(cascade = CascadeType.ALL)
        @JoinTable(name = "tb_responsavel_aluno", joinColumns = @JoinColumn(name = "responsavel_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "aluno_id", referencedColumnName = "id"))
        private List<Responsavel> responsaveis;

        @OneToOne(fetch = FetchType.LAZY, orphanRemoval = true)
        @JoinColumn(name = "id", referencedColumnName = "aluno_id")
        @MapsId
        private Serie serie;

        @ManyToOne(optional = false)
        @JoinColumn(name = "instituicao_id", referencedColumnName = "id")
        private Instituicao instituicao;

        public Aluno(){
              this.setTipoUsuario(TipoUsuario.ALUNO);

        }
}
