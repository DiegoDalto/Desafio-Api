package br.ufms.desafio.controller;

import br.ufms.desafio.controller.generic.ReadWriteController;
import br.ufms.desafio.entity.Usuario;
import br.ufms.desafio.repository.generic.ReadWriteBaseRepository;
import br.ufms.desafio.service.generic.ReadWriteService;


public abstract class UsuarioBaseController<U extends Usuario>
        extends ReadWriteController<U, Long, ReadWriteService<U, Long, ? extends ReadWriteBaseRepository<U, Long>>> {

}