package br.ufms.desafio.service;

import br.ufms.desafio.entity.Endereco;
import br.ufms.desafio.repository.EnderecoRepository;
import br.ufms.spbootlib.service.ReadWriteService;
import org.springframework.stereotype.Component;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */
@Component
public class EnderecoService extends ReadWriteService<Endereco, Long, EnderecoRepository> {

}