package br.ufms.desafio.controller;

import br.ufms.desafio.entity.Telefone;
import br.ufms.desafio.service.TelefoneService;
import br.ufms.spbootlib.web.ReadWriteController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/telefone")
public class TelefoneController extends ReadWriteController<Telefone, Long, TelefoneService> {

}