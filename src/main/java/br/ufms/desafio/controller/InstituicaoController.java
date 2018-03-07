package br.ufms.desafio.controller;

import br.ufms.desafio.entity.Instituicao;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/instituicao")
public class InstituicaoController extends UsuarioBaseController<Instituicao> {
}
