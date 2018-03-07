package br.ufms.desafio.controller;

import br.ufms.desafio.entity.Jogador;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/jogador")
public class JogadorController extends JogadorBaseController<Jogador> {
}

