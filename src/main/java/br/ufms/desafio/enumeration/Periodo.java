package br.ufms.desafio.enumeration;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */

public enum Periodo {

    MATUTINO("Matutino"),
    VESPERTINO("Vespertino"),
    INTEGRAL("Integral"),
    NOTURNO("Noturno");

    private String periodo;

    Periodo(String periodo) {
        this.periodo = periodo;
    }

    public String toString() {
        return this.periodo;
    }
}
