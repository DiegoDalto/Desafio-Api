package br.ufms.desafio.controller;

import br.ufms.desafio.entity.Municipio;
import br.ufms.desafio.service.MunicipioService;
import br.ufms.spbootlib.web.ReadOnlyController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/municipios")
public class MunicipioController extends ReadOnlyController<Municipio, Long, MunicipioService> {

}