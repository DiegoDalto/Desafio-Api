package br.ufms.desafio.controller.generic;

/*
 * Copyright (C) 2017 Universidade Federal de Mato Grosso do Sul
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

import java.io.Serializable;
import java.util.List;

import br.ufms.desafio.entity.generic.GenericEntity;
import br.ufms.desafio.repository.generic.ReadOnlyBaseRepository;
import br.ufms.desafio.service.generic.ReadOnlyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @param <E>
 * @param <ID>
 * @param <S>
 * @author Kleber Kruger
 */
public class ReadOnlyController<E extends GenericEntity<ID>, ID extends Serializable, S extends ReadOnlyService<E, ID, ? extends ReadOnlyBaseRepository<E, ID>>> {

    @Autowired
    private S service;

    private static final Logger LOG = LoggerFactory.getLogger(ReadOnlyController.class);

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public E findOne(@PathVariable("id") ID id) {
        LOG.info("Entidades encontrads com findOne(" + id + ")");
        LOG.info("-------------------------------");
        E e = service.findOne(id);
        LOG.info(e != null ? e.toString() : "Inexistente");
        LOG.info("-------------------------------\n");

        return getService().findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<E> findAll() {
        LOG.info("Entidades encontrads com findAll():");
        LOG.info("-------------------------------");
        service.findAll().forEach((entity) -> {
            LOG.info(entity.toString());
        });
        LOG.info("-------------------------------\n");

        return getService().findAll();
    }

    /**
     * @return the service
     */
    public S getService() {
        return service;
    }

}