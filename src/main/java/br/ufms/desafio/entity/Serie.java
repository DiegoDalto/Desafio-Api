package br.ufms.desafio.entity;

import br.ufms.desafio.enumeration.NivelEnsino;
import br.ufms.genericlib.domain.GenericEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb_serie")
public class Serie extends GenericEntity<Long>{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
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
