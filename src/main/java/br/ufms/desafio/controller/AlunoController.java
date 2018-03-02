package br.ufms.desafio.controller;

import br.ufms.desafio.entity.Aluno;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/alunos")
public class AlunoController extends JogadorBaseController<Aluno> {

}
