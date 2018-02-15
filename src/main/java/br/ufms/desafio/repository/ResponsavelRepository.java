package br.ufms.desafio.repository;

import br.ufms.desafio.entity.Responsavel;
import org.springframework.stereotype.Component;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */
@Component
@SuppressWarnings("unchecked")
public class ResponsavelRepository extends UsuarioRepository<Responsavel> {

    public ResponsavelRepository() {
        super(Responsavel.class);
    }
}
