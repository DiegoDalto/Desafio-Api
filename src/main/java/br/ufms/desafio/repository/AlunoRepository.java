package br.ufms.desafio.repository;

import br.ufms.desafio.entity.Aluno;
import org.springframework.data.jpa.repository.Query;

public interface AlunoRepository extends JogadorBaseRepository<Aluno> {

        @Query("SELECT a FROM Aluno AS a WHERE a.nome = ?1")
        public Aluno findByNome(String nome);
}