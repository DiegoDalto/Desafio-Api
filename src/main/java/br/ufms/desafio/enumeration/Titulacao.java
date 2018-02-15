package br.ufms.desafio.enumeration;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */

public enum Titulacao {

    GRADUANDO("Graduando"),
    GRADUADO("Graduado"),
    ESPECIALISTA("Especialista"),
    MESTRE("Mestre"),
    DOUTOR("Doutor"),
    POS_DOUTOR("Pós-doutor");

    private String tipoTitulacao;

    Titulacao(String tipoTitulacao) {
        this.tipoTitulacao = tipoTitulacao;
    }

    public String toString() {
        return this.tipoTitulacao;
    }
}
