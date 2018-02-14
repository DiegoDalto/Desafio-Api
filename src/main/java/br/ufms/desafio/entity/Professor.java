package br.ufms.desafio.entity;

import br.ufms.desafio.enumeration.TipoUsuario;
import br.ufms.desafio.enumeration.Titulacao;

import javax.persistence.*;

@Entity
@Table(name = "tb_professor")
public class Professor extends Jogador {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "titulacao")
    @Enumerated(EnumType.STRING)
    private Titulacao titulacao;

    public Professor(){
        this.setTipoUsuario(TipoUsuario.PROFESSOR);
    }


}
