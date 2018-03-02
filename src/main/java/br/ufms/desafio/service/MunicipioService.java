package br.ufms.desafio.service;

import br.ufms.desafio.entity.Municipio;
import br.ufms.desafio.repository.MunicipioRepository;
import br.ufms.desafio.service.generic.ReadWriteService;
import org.springframework.stereotype.Component;


/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */
@Component
public class MunicipioService extends ReadWriteService<Municipio, Long, MunicipioRepository> {

}