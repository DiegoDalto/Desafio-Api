package br.ufms.desafio.controller;

import br.ufms.desafio.entity.Usuario;
import br.ufms.spbootlib.domain.ReadWriteBaseRepository;
import br.ufms.spbootlib.service.ReadWriteService;
import br.ufms.spbootlib.web.ReadWriteController;

public abstract class UsuarioBaseController<U extends Usuario>
        extends ReadWriteController<U, Long, ReadWriteService<U, Long, ? extends ReadWriteBaseRepository<U, Long>>> {

}