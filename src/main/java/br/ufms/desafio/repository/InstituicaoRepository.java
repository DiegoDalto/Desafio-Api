package br.ufms.desafio.repository;

import br.ufms.desafio.entity.Instituicao;
import org.springframework.stereotype.Component;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */
@Component
@SuppressWarnings("unchecked")
public class InstituicaoRepository extends UsuarioRepository<Instituicao> {

    public InstituicaoRepository() {
        super(Instituicao.class);
    }
}
