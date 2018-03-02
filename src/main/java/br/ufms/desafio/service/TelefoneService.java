package br.ufms.desafio.service;

import br.ufms.desafio.entity.Telefone;
import br.ufms.desafio.repository.TelefoneRepository;
import br.ufms.spbootlib.service.ReadWriteService;
import org.springframework.stereotype.Component;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */
@Component
public class TelefoneService extends ReadWriteService<Telefone, Long, TelefoneRepository> {

}
