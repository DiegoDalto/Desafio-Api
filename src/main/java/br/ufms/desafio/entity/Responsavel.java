//package br.ufms.desafio.entity;
//
//import br.ufms.desafio.enumeration.TipoUsuario;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.PrimaryKeyJoinColumn;
//import javax.persistence.Table;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
//
///**
// * Created by Diego Dalto
// * Copyright (c) 2018, UFMS, All rights reserved.
// */
//
//@Entity
//@PrimaryKeyJoinColumn(name="id")
//@Table(name = "tb_responsavel")
//public class Responsavel extends Usuario {
//
//    private static final long serialVersionUID = 1L;
//
//    @Column(name = "cpf")
//    @Size(min = 11, max = 11)
//    @NotNull
//    private String cpf;
//
//    // TODO: Criar uma lista de responsabilidades. Cada responsabilidade contém um aluno e o professor que adicionou.
//
//    public Responsavel() {
//        this.setTipoUsuario(TipoUsuario.RESPONSAVEL);
//    }
//
//    public String getCpf() {
//        return cpf;
//    }
//
//    public void setCpf(String cpf) {
//        this.cpf = cpf;
//    }
//}
