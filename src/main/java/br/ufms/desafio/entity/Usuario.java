package br.ufms.desafio.entity;

import br.ufms.desafio.enumeration.TipoUsuario;
import br.ufms.genericlib.domain.GenericEntity;

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
    private String usuario;

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
        return null;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
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
}
