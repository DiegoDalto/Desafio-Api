package br.ufms.desafio.entity;

import br.ufms.desafio.enumeration.TipoInstituicao;
import br.ufms.desafio.enumeration.TipoUsuario;
import br.ufms.genericlib.domain.GenericEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb_instituicao")
public class Instituicao extends Usuario{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "tipo")
    @NotNull
    @Enumerated(EnumType.STRING)
    private TipoInstituicao tipoInstituicao;

    public Instituicao(){
        this.setTipoUsuario(TipoUsuario.INSTITUICAO);
    }

    @Override
    public Long getId() {
        return id;
    }
}
