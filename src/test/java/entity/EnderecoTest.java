package entity;

import br.ufms.desafio.entity.Endereco;
import br.ufms.desafio.entity.Municipio;
import br.ufms.desafio.entity.Usuario;
import br.ufms.desafio.enumeration.UF;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */
public class EnderecoTest {

    @Test
    public void getAndSetterTest(){
        Endereco endereco = new Endereco();
        Municipio municipio = new Municipio();
        Usuario usuario = new Usuario();

        usuario.setId(1L);

        municipio.setId(1L);
        municipio.setNome("Coxim");
        municipio.setTipoUF(UF.MS);

        endereco.setId(1L);
        endereco.setBairro("São Judas Tadeu");
        endereco.setCep("79400000");
        endereco.setComplemento("casa residencial");
        endereco.setLogradouro("R. 13 de Maio");
        endereco.setMunicipio(municipio);
        endereco.setNumero((short) 231);
        endereco.setSemNumero(false);
        endereco.setUsuario(usuario);


        Assert.assertTrue(endereco.getId().equals(endereco.getId()));
        Assert.assertTrue(endereco.getBairro().equals(endereco.getBairro()));
        Assert.assertTrue(endereco.getCep().equals(endereco.getCep()));
        Assert.assertTrue(endereco.getComplemento().equals(endereco.getComplemento()));
        Assert.assertTrue(endereco.getLogradouro().equals(endereco.getLogradouro()));
        Assert.assertTrue(endereco.getMunicipio().equals(endereco.getMunicipio()));
        Assert.assertTrue(endereco.getNumero().equals(endereco.getNumero()));
        Assert.assertTrue(endereco.getSemNumero().equals(endereco.getSemNumero()));
        Assert.assertTrue(endereco.getUsuario().equals(endereco.getUsuario()));
    }

    @Test
    public void hascodeTest(){
        Endereco endereco = new Endereco();
        Municipio municipio = new Municipio();
        Usuario usuario = new Usuario();

        usuario.setId(1L);

        municipio.setId(1L);
        municipio.setNome("Coxim");
        municipio.setTipoUF(UF.MS);

        endereco.setId(1L);
        endereco.setBairro("São Judas Tadeu");
        endereco.setCep("79400000");
        endereco.setComplemento("casa residencial");
        endereco.setLogradouro("R. 13 de Maio");
        endereco.setMunicipio(municipio);
        endereco.setNumero((short) 231);
        endereco.setSemNumero(false);
        endereco.setUsuario(usuario);

        Assert.assertNotNull(Integer.valueOf(endereco.hashCode()));

        endereco.setId(null);
        Assert.assertNotNull(Integer.valueOf(endereco.hashCode()));
    }

    @Test
    public void construtorTest(){
        Endereco endereco = new Endereco();

        Assert.assertTrue(endereco != null);
    }
}
