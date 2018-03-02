package br.ufms.desafio.repository;

import br.ufms.desafio.entity.Instituicao;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;

public interface InstituicaoRepository extends UsuarioBaseRepository<Instituicao> {

    @Query("select i from Instituicao as i where i.nome = ?1")
    public Instituicao findByNome(String nome);
}
