package br.ufms.desafio.enumeration;

public enum  TipoUsuario {

    ALUNO("Aluno"),
    PROFESSOR("Professor"),
    RESPONSAVEL("Responsável"),
    INSTITUICAO("Instituição");

    private String tipoUsuario;

    TipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String toString() {
        return this.tipoUsuario;
    }
}
