package br.ufms.desafio.enumeration;

/**
 * Created by Diego Dalto on 02/02/2018.
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
