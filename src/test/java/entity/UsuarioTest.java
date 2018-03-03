package entity;

import br.ufms.desafio.entity.Endereco;
import br.ufms.desafio.entity.Municipio;
import br.ufms.desafio.entity.Telefone;
import br.ufms.desafio.entity.Usuario;
import br.ufms.desafio.enumeration.TipoTelefone;
import br.ufms.desafio.enumeration.TipoUsuario;
import br.ufms.desafio.service.UsuarioService;
import org.junit.Test;

import java.util.Date;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */
public class UsuarioTest {

    @Test
    public void getAndSetterTest(){
        Usuario usuario = new Usuario();
        Telefone telefone = new Telefone();
        Municipio municipio = new Municipio();
        Endereco endereco = new Endereco();

        telefone.setId(1L);
        telefone.setNumero("67999174009");
        telefone.setPrincipal(true);
        telefone.setTipo(TipoTelefone.CELULAR);
        telefone.setUsuario(usuario);

        municipio.setId(1L);
        municipio.setTipoUF("MS");
        municipio.setNome("Coxim");

        endereco.setId(1L);
        endereco.setBairro("São Judas Tadeu");
        endereco.setCep("7940000");
        endereco.setComplemento("Casa residencial");
        endereco.setLogradouro("Rua 13 de Maio");
        endereco.setNumero((short) 231);
        endereco.setSemNumero(false);
        endereco.setMunicipio(municipio);

        usuario.setId(1L);
        usuario.setDataCriacao(new Date());
        usuario.setEmail("diego.dalto@hotmail.com");
        usuario.setEndereco(endereco);
        usuario.setNome("Diego Dalto");
        usuario.setUser("admin");
        usuario.setSenha("123");
        usuario.setTipoUsuario(TipoUsuario.ADMIN);
        usuario.setId(1L);
        usuario.addTelefone(telefone);

        UsuarioService usuarioService = new UsuarioService();
        usuarioService.save(usuario);

//        Assert.assertTrue(endereco.getId().equals(endereco.getId()));
//        Assert.assertTrue(endereco.getBairro().equals(endereco.getBairro()));
//        Assert.assertTrue(endereco.getCep().equals(endereco.getCep()));
//        Assert.assertTrue(endereco.getComplemento().equals(endereco.getComplemento()));
//        Assert.assertTrue(endereco.getLogradouro().equals(endereco.getLogradouro()));
//        Assert.assertTrue(endereco.getMunicipio().equals(endereco.getMunicipio()));
//        Assert.assertTrue(endereco.getNumero().equals(endereco.getNumero()));
//        Assert.assertTrue(endereco.getSemNumero().equals(endereco.getSemNumero()));
//        Assert.assertTrue(endereco.getUsuario().equals(endereco.getUsuario()));
    }

    @Test
    public void hascodeTest(){
    }

    @Test
    public void construtorTest(){
    }
}
