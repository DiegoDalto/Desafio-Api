package br.ufms.desafio.enumeration;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */

public enum NivelEnsino {

    PRE_ESCOLA("Pré-escola"),
    FUNDAMENTAL("Fundamental"),
    MEDIO("Médio"),
    SUPERIOR("Superior");

    private String tipoNivel;

    NivelEnsino(String tipoNivel) {
        this.tipoNivel = tipoNivel;
    }

    public String toString() {
        return this.tipoNivel;
    }
}
