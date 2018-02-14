package br.ufms.desafio.enumeration;

/**
 * Created by Diego Dalto on 02/02/2018.
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