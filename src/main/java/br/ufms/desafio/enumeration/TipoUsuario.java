package br.ufms.desafio.enumeration;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */

public enum  TipoUsuario {

    ALUNO("Aluno"),
    PROFESSOR("Professor"),
    RESPONSAVEL("Responsável"),
    INSTITUICAO("Instituição"),
    ADMIN("Admin");

    private String tipoUsuario;

    TipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String toString() {
        return this.tipoUsuario;
    }
}
