package br.ufms.desafio.repository;

import br.ufms.desafio.entity.Usuario;
import br.ufms.spbootlib.domain.ReadWriteBaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface UsuarioBaseRepository<U extends Usuario> extends ReadWriteBaseRepository<U, Long> {

    @Query("select u from #{#entityName} as u where u.nome = ?1")
    public U findByNome(String nome);
}
