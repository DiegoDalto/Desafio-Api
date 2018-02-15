package br.ufms.desafio.enumeration;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */

public enum TipoTelefone {

    CELULAR("Celular"),
    RESIDENCIAL("Residencial"),
    INSTITUCIONAL("Institucional");

    private String tipoTelefone;

    TipoTelefone(String tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }

    public String toString() {
        return this.tipoTelefone;
    }
}