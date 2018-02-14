package br.ufms.desafio.entity;

import br.ufms.desafio.enumeration.TipoDeficiencia;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "tb_jogador")
public class Jogador extends Usuario {

        private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue
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

//        @Override
//        public Usuario getUsuario(){
//                return usuario;
//        }

        public void setUsuario(Usuario usuario) {
                this.usuario = usuario;
        }
}
