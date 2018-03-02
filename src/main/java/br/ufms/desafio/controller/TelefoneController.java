package br.ufms.desafio.controller;

import br.ufms.desafio.controller.generic.ReadWriteController;
import br.ufms.desafio.entity.Telefone;
import br.ufms.desafio.repository.TelefoneRepository;
import br.ufms.desafio.service.TelefoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/telefone")
public class TelefoneController extends ReadWriteController<Telefone, Long, TelefoneService> {

}