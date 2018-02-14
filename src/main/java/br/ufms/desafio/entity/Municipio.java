package br.ufms.desafio.entity;

import br.ufms.desafio.enumeration.UF;
import br.ufms.genericlib.domain.GenericEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_municipio")
public class Municipio extends GenericEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "codigo_ibge")
    private Long codigoIbge;

    @Column(name = "nome")
    @Size(min = 1,max = 64)
    @NotNull
    private String nome;

    @Column(name = "uf")
    @NotNull
    private UF tipoUF;


    public Long getCodigoIbge() {
        return codigoIbge;
    }

    public void setCodigoIbge(Long codigoIbge) {
        this.codigoIbge = codigoIbge;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public UF getTipoUF() {
        return tipoUF;
    }

    public void setTipoUF(UF tipoUF) {
        this.tipoUF = tipoUF;
    }

    public Long getId() {
        return codigoIbge;
    }
}
