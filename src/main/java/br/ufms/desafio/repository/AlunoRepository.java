package br.ufms.desafio.repository;

import br.ufms.desafio.entity.Aluno;
import org.springframework.stereotype.Component;

@Component
@SuppressWarnings("unchecked")
public class AlunoRepository extends JogadorRepository<Aluno> {

    public AlunoRepository() {
        super(Aluno.class);
    }
}
