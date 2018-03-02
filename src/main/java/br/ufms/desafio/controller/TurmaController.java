package br.ufms.desafio.controller;

import br.ufms.desafio.controller.generic.ReadWriteController;
import br.ufms.desafio.entity.Municipio;
import br.ufms.desafio.entity.Turma;
import br.ufms.desafio.repository.MunicipioRepository;
import br.ufms.desafio.repository.TurmaRepository;
import br.ufms.desafio.service.TurmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/turma")
public class TurmaController extends ReadWriteController<Turma, Long, TurmaService> {

}

