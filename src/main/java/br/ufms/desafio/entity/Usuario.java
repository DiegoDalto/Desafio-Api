package br.ufms.desafio.entity;

import br.ufms.desafio.entity.generic.GenericEntity;
import br.ufms.desafio.enumeration.TipoUsuario;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "tb_usuario")
public class Usuario extends GenericEntity<Long> implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    @Size(min = 1,max = 64)
    @NotNull
    private String nome;

    @Column(name = "email")
    @Size(min = 1,max = 64)
    @NotNull
    private String email;

    @Column(name = "usuario")
    @Size(min = 1,max = 48)
    @NotNull
    private String user;

    @Column(name = "senha")
    @Size(min = 1,max = 64)
    @NotNull
    private String senha;

    @Column(name = "data_criacao")
    @NotNull
    private LocalDate dataCriacao;

    @Column(name = "tipo")
    @NotNull
    private TipoUsuario tipoUsuario;

    public Usuario(){
        this.dataCriacao = LocalDate.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        return !((this.id == null && other.id != null)
                || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return getClass().toString() + "[id=" + id + "]";
    }
}
