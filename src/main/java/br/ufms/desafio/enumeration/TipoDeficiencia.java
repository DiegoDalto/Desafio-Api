package br.ufms.desafio.enumeration;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */
public enum TipoDeficiencia {

    AUDITIVA("Auditiva"),
    FISICA("Física"),
    MENTAL("Mental"),
    VISUAL("Visual");

    private String tipoDeficiencia;

    TipoDeficiencia(String tipoDeficiencia) {
        this.tipoDeficiencia = tipoDeficiencia;
    }

    public String toString() {
        return this.tipoDeficiencia;
    }
}
