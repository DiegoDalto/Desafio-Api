package br.ufms.desafio.enumeration;

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
