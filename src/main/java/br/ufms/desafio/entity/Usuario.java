package br.ufms.desafio.entity;

import br.ufms.desafio.enumeration.TipoUsuario;
import br.ufms.spbootlib.domain.GenericEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

@Entity
@Table(name = "tb_usuario")
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario extends GenericEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    @Size(min = 1, max = 64)
    @NotNull
    private String nome;

    @Column(name = "email")
    @Size(min = 1, max = 64)
    @NotNull
    private String email;

    @Column(name = "usuario")
    @Size(min = 1, max = 48)
    @NotNull
    private String user;

    @Column(name = "senha")
    @Size(min = 1, max = 64)
    @NotNull
    private String senha;

    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Endereco endereco;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<Telefone> telefones;

    @Column(name = "data_criacao")
    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    private Date dataCriacao;

    @Column(name = "tipo")
    @Enumerated(EnumType.STRING)
    @Size(min = 1, max = 64)
    @NotNull
    private TipoUsuario tipoUsuario;

    public Usuario() {
        this.telefones = new HashSet<>();
    }

    /**
     * Adiciona um telefone a esta pessoa.
     *
     * @param telefone
     */
    public void addTelefone(Telefone telefone) {
        telefones.add(telefone);
        telefone.setUsuario(this);
    }

    /**
     * Remove um telefone desta pessoa.
     *
     * @param telefone
     */
    public void removeTelefone(Telefone telefone) {
        telefones.remove(telefone);
        telefone.setUsuario(null);
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Collection<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(Collection<Telefone> telefones) {
        this.telefones = telefones;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (id != null ? id.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        if (!(object instanceof Usuario)) {
//            return false;
//        }
//        Usuario other = (Usuario) object;
//        return !((this.id == null && other.id != null)
//                || (this.id != null && !this.id.equals(other.id)));
//    }
//
//    @Override
//    public String toString() {
//        return getClass().toString() + "[id=" + id + "]";
//    }
}
