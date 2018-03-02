package br.ufms.desafio.service;

import br.ufms.desafio.entity.Turma;
import br.ufms.desafio.repository.TurmaRepository;
import br.ufms.desafio.service.generic.ReadWriteService;
import org.springframework.stereotype.Component;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */
@Component
public class TurmaService extends ReadWriteService<Turma, Long, TurmaRepository> {

}
