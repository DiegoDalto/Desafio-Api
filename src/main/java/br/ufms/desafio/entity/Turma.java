package br.ufms.desafio.entity;

import br.ufms.desafio.enumeration.Periodo;
import br.ufms.genericlib.domain.GenericEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_turma")
public class Turma extends GenericEntity<Long>{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;


    private Long professor_id;
    private Long instituicao_id;

    @Column(name = "nome")
    @NotNull
    @Size(min = 1,max = 64)
    private String nome;

    @Column(name = "periodo")
    @Enumerated(EnumType.STRING)
    private Periodo periodo;

    @Override
    public Long getId() {
        return null;
    }
}
