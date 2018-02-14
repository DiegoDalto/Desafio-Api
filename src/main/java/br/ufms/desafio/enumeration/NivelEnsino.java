package br.ufms.desafio.enumeration;

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
