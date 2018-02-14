package br.ufms.desafio.entity;

import br.ufms.desafio.enumeration.TipoUsuario;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tb_aluno")
public class Aluno extends Jogador {

        private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue
        @Column(name = "id")
        private Long id;

        @Column(name = "instituicao_id")
        private Long instituicao_id;

        @Column(name = "data_inicio")
        private LocalDate dataInicio;

        public Aluno(){
              this.setTipoUsuario(TipoUsuario.ALUNO);
        }
}
