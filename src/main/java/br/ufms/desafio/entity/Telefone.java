package br.ufms.desafio.entity;

import br.ufms.desafio.enumeration.TipoTelefone;

import javax.persistence.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */

@Entity
@Table(name = "tb_telefone")
public class Telefone extends Entidade implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo")
    private TipoTelefone tipo;

    @Column(name = "numero")
    @Size(min = 10, max = 11)
    @NotNull
    private String numero;

    @Column(name = "principal")
    private Boolean principal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public Telefone() {
        this.principal = true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoTelefone getTipo() {
        return tipo;
    }

    public void setTipo(TipoTelefone tipo) {
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Boolean getPrincipal() {
        return principal;
    }

    public void setPrincipal(Boolean principal) {
        this.principal = principal;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Telefone)) {
            return false;
        }
        Telefone other = (Telefone) object;
        return !((this.id == null && other.id != null)
                || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return getClass().toString() + "[id=" + id + "]";
    }
}
