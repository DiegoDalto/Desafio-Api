package br.ufms.desafio.service;

import br.ufms.desafio.entity.Serie;
import br.ufms.desafio.repository.SerieRepository;
import br.ufms.spbootlib.service.ReadWriteService;
import org.springframework.stereotype.Component;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */
@Component
public class SerieService extends ReadWriteService<Serie, Long, SerieRepository> {

}