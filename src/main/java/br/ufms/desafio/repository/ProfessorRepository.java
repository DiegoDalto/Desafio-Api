//package br.ufms.desafio.repository;
//
//import br.ufms.desafio.entity.Professor;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.NoRepositoryBean;
//
//public interface ProfessorRepository extends JogadorBaseRepository<Professor> {
//
//    @Query("select p from Professor as p where p.nome = ?1")
//    public Professor findByNome(String nome);
//}