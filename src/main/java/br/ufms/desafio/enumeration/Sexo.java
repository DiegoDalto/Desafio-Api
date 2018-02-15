package br.ufms.desafio.enumeration;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */

public enum Sexo {

    MASCULINO("Masculino"),
    FEMININO("Feminino");

    private String sexo;

    Sexo(String sexo) {
        this.sexo = sexo;
    }

    public String toString() {
        return this.sexo;
    }
}
