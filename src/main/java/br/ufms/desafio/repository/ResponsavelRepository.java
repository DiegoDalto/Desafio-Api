//package br.ufms.desafio.repository;
//
//import br.ufms.desafio.entity.Responsavel;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.NoRepositoryBean;
//
//
//public interface ResponsavelRepository extends UsuarioBaseRepository<Responsavel> {
//
//    @Query("select r from Responsavel as r where r.nome = ?1")
//    public Responsavel findByNome(String nome);
//}
