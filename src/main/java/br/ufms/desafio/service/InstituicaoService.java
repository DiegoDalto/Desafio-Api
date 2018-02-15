package br.ufms.desafio.service;

import br.ufms.desafio.entity.Instituicao;
import br.ufms.desafio.repository.InstituicaoRepository;
import org.springframework.stereotype.Component;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */
@Component
public class InstituicaoService extends UsuarioService<Instituicao, InstituicaoRepository> {
}

