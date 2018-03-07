package br.ufms.desafio.service;

import br.ufms.desafio.entity.Aluno;
import br.ufms.desafio.entity.Usuario;
import br.ufms.desafio.repository.AlunoRepository;
import br.ufms.desafio.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AlunoService extends JogadorBaseService<Aluno> {

//    @Autowired
//    private AlunoRepository alunoRepository;
//
//    @Autowired
//    private UsuarioRepository usuarioRepository;
//
//    public List<Aluno> findAll() {
//        return alunoRepository.findAll();
//    }
//
//    public Aluno save(Aluno aluno) {
//        return alunoRepository.save(aluno);
//    }
//
//    public void delete(Long id) {
//        Usuario usuario = usuarioRepository.findOne(id);
//        if(usuario.getTipoUsuario().equals(1)){
//            usuarioRepository.delete(usuario);
//        }
//    }
//
//    public Aluno buscarPorInstituicao(String nome) {
//        return alunoRepository.findByNome(nome);
//    }
}
