package br.ufms.desafio.enumeration;

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
