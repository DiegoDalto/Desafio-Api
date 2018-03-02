package entity;

import br.ufms.desafio.controller.AlunoController;
import br.ufms.desafio.entity.*;
import br.ufms.desafio.enumeration.UF;
import br.ufms.desafio.repository.AlunoRepository;
import br.ufms.desafio.service.AlunoService;
import br.ufms.desafio.service.TelefoneService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */
public class EnderecoTest {

    @Autowired
    private TelefoneService service;

    @Test
    public void getAndSetterTest(){

        System.out.println(service);

        Telefone aluno = new Telefone();
        aluno.setNumero("Teste");
//        AlunoController controller = new AlunoController();
//        controlle
        TelefoneService alunoService = new TelefoneService();
        alunoService.save(aluno);

//        Endereco endereco = new Endereco();
//        Municipio municipio = new Municipio();
//        Usuario usuario = new Usuario();
//
//        usuario.setId(1L);
//
//        municipio.setId(1L);
//        municipio.setNome("Coxim");
//        municipio.setTipoUF(UF.MS);
//
//        endereco.setId(1L);
//        endereco.setBairro("São Judas Tadeu");
//        endereco.setCep("79400000");
//        endereco.setComplemento("casa residencial");
//        endereco.setLogradouro("R. 13 de Maio");
//        endereco.setMunicipio(municipio);
//        endereco.setNumero((short) 231);
//        endereco.setSemNumero(false);
//        endereco.setUsuario(usuario);
//
//        Assert.assertTrue(endereco.getId().equals(1L));
//        Assert.assertTrue(endereco.getBairro().equals("São Judas Tadeu"));
//        Assert.assertTrue(endereco.getCep().equals("79400000"));
//        Assert.assertTrue(endereco.getComplemento().equals("casa residencial"));
//        Assert.assertTrue(endereco.getLogradouro().equals("R. 13 de Maio"));
//        Assert.assertTrue(endereco.getMunicipio().getId().equals(1L));
//        Assert.assertTrue(endereco.getMunicipio().getNome().equals("Coxim"));
//        Assert.assertTrue(endereco.getMunicipio().getTipoUF().equals(UF.MS));
//        Assert.assertTrue(endereco.getNumero().equals((short)231));
//        Assert.assertTrue(endereco.getSemNumero().equals(false));
//        Assert.assertTrue(endereco.getUsuario().getId().equals(1L));
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
