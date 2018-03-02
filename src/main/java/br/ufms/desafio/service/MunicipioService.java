package br.ufms.desafio.service;

import br.ufms.desafio.entity.Municipio;
import br.ufms.desafio.repository.MunicipioRepository;
import br.ufms.spbootlib.service.ReadOnlyService;
import org.springframework.stereotype.Component;

@Component
public class MunicipioService extends ReadOnlyService<Municipio, Long, MunicipioRepository> {
}
