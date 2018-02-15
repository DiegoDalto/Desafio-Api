package br.ufms.desafio.entity;

import br.ufms.desafio.enumeration.TipoDeficiencia;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */

@Entity
@PrimaryKeyJoinColumn(name="id")
@Table(name = "tb_jogador")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "Jogador.findAll", query = "SELECT j FROM Jogador j"),
        @NamedQuery(name = "Jogador.findById", query = "SELECT j FROM Jogador j WHERE j.id = :id"),
        @NamedQuery(name = "Jogador.findByDataNascimento", query = "SELECT j FROM Jogador j WHERE j.dataNascimento = :dataNascimento")
})
public class Jogador extends Usuario implements Serializable {

        private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "id")
        private Long id;

        @Column(name = "data_nascimento")
        @NotNull
        private LocalDate dataNascimento;

        @Column(name = "deficiencias")
        private TipoDeficiencia tipoDeficiencia;

        @OneToOne(fetch = FetchType.LAZY, orphanRemoval = true)
        @JoinColumn(name = "id", referencedColumnName = "id")
        @MapsId
        private Usuario usuario;

        public Jogador(){
        }

        @Override
        public Long getId() {
                return id;
        }

        @Override
        public void setId(Long id) {
                this.id = id;
        }

        public LocalDate getDataNascimento() {
                return dataNascimento;
        }

        public void setDataNascimento(LocalDate dataNascimento) {
                this.dataNascimento = dataNascimento;
        }

        public TipoDeficiencia getTipoDeficiencia() {
                return tipoDeficiencia;
        }

        public void setTipoDeficiencia(TipoDeficiencia tipoDeficiencia) {
                this.tipoDeficiencia = tipoDeficiencia;
        }

        public Usuario getUsuario() {
                return usuario;
        }

        public void setUsuario(Usuario usuario) {
                this.usuario = usuario;
        }
}
