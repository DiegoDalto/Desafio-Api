package br.ufms.desafio.controller;

import br.ufms.desafio.entity.Professor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/professor")
public class ProfessorController extends JogadorBaseController<Professor> {
}
