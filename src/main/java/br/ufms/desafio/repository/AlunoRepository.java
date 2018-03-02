//package br.ufms.desafio.repository;
//
//import br.ufms.desafio.entity.Aluno;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.NoRepositoryBean;
//
//public interface AlunoRepository extends JogadorBaseRepository<Aluno> {
//
//        @Query("select a from Aluno as a where a.nome = ?1")
//        public Aluno findByNome(String nome);
//}