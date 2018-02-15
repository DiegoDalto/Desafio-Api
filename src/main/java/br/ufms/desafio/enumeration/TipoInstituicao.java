package br.ufms.desafio.enumeration;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */

public enum TipoInstituicao {

    MUNICIPAL("Municipal"),
    ESTADUAL("Estadual"),
    FEDERAL("Federal"),
    PARTICULAR("Particular");

    private String tipoInstiuicao;

    TipoInstituicao(String tipoInstiuicao) {
        this.tipoInstiuicao = tipoInstiuicao;
    }

    public String toString() {
        return this.tipoInstiuicao;
    }
}
