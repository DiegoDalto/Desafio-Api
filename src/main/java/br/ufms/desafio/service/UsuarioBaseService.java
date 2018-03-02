package br.ufms.desafio.service;

import br.ufms.desafio.entity.Usuario;
import br.ufms.desafio.repository.UsuarioBaseRepository;
import br.ufms.spbootlib.service.ReadWriteService;

public abstract class UsuarioBaseService<U extends Usuario>
        extends ReadWriteService<U, Long, UsuarioBaseRepository<U>> {
}
