package br.ufms.desafio.controller;

import br.ufms.desafio.entity.Responsavel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/responsavel")
public class ResponsavelController extends UsuarioBaseController<Responsavel> {

}