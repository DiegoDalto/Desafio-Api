package br.ufms.desafio.enumeration;

public enum Sexo {

    MASCULINO("Masculino"),
    FEMININO("Feminino");

    private String sexo;

    Sexo(String sexo) {
        this.sexo = sexo;
    }

    public String toString() {
        return this.sexo;
    }
}