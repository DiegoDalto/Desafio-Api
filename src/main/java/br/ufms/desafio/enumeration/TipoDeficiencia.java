package br.ufms.desafio.enumeration;

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
