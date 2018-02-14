package br.ufms.desafio.entity;

import br.ufms.desafio.enumeration.TipoUsuario;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_responsavel")
public class Responsavel extends Usuario{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "cpf")
    @Size(min = 11, max = 11)
    @NotNull
    private String cpf;

    @OneToOne(fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "id", referencedColumnName = "id")
    @MapsId
    private Usuario usuario;


    public Responsavel(){
        this.setTipoUsuario(TipoUsuario.RESPONSAVEL);
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

//    @Override
//    public Usuario getUsuario() {
//        return usuario;
//    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
