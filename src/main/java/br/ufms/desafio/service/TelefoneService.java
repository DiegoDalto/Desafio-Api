package br.ufms.desafio.service;

import br.ufms.desafio.entity.Endereco;
import br.ufms.desafio.entity.Telefone;
import br.ufms.desafio.entity.Turma;
import br.ufms.desafio.repository.EnderecoRepository;
import br.ufms.desafio.repository.TelefoneRepository;
import br.ufms.desafio.repository.TurmaRepository;
import br.ufms.desafio.service.generic.ReadWriteService;
import org.springframework.stereotype.Component;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */
@Component
public class TelefoneService extends ReadWriteService<Telefone, Long, TelefoneRepository> {

}
