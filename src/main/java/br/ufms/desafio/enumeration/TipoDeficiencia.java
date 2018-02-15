package br.ufms.desafio.enumeration;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */
public enum TipoDeficiencia {

    AUDITIVA("Celular"),
    FISICA("Residencial"),
    MENTAL("Institucional"),
    VISUAL("Visual");

    private String tipoDeficiencia;

    TipoDeficiencia(String tipoDeficiencia) {
        this.tipoDeficiencia = tipoDeficiencia;
    }

    public String toString() {
        return this.tipoDeficiencia;
    }
}
