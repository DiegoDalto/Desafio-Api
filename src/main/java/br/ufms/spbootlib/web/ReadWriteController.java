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
package br.ufms.spbootlib.web;

import br.ufms.spbootlib.domain.GenericEntity;
import br.ufms.spbootlib.domain.ReadWriteBaseRepository;
import br.ufms.spbootlib.service.ReadWriteService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 *
 * @author Kleber Kruger
 *
 * @param <E>
 * @param <ID>
 * @param <S>
 */
@MappedSuperclass
public class ReadWriteController<E extends GenericEntity<ID>, ID extends Serializable, S extends ReadWriteService<E, ID, ? extends ReadWriteBaseRepository<E, ID>>>
        extends ReadOnlyController<E, ID, S> {

    /**
     *
     * @param <S>
     * @param entity
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public <S extends E> S insert(@RequestBody S entity) {
        return getService().save(entity);
    }

    /**
     *
     * @param <S>
     * @param entity
     * @return
     */
    @RequestMapping(method = RequestMethod.PUT)
    public <S extends E> S update(@RequestBody S entity) {
        return getService().save(entity);
    }

    /**
     *
     * @param entity
     */
    @RequestMapping(method = RequestMethod.DELETE)
    public void delete(@RequestBody E entity) {
        getService().delete(entity);
    }

    /**
     *
     * @param id
     */
    @RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
    public void delete(@PathVariable("id") ID id) {
        getService().delete(id);
    }

}
