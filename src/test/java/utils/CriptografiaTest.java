package utils;

import br.ufms.desafio.utils.Criptografia;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */
public class CriptografiaTest {

    @Test
    public void criptografarTest(){
        String nome = "Diego Dalto";

        Criptografia criptografia = new Criptografia();
        String nome2 = criptografia.criptografar(nome);

        Assert.assertFalse(nome.equals(nome2));
    }

    @Test
    public void descriptografarTest(){
        String teste = "Diego Dalto";

        Criptografia criptografia = new Criptografia();
        String nome1 = criptografia.criptografar(teste);
        String nome2 = criptografia.criptografar(teste);

        Assert.assertTrue(nome1.equals(nome2));
    }

    @Test
    public void descriptografarComErroTest(){
        String teste = "Diego Dalto";

        Criptografia criptografia = new Criptografia();
        String nome1 = criptografia.criptografar(teste);
        teste = "DiegoDalto";
        String nome2 = criptografia.criptografar(teste);

        Assert.assertFalse(nome1.equals(nome2));
    }
}
