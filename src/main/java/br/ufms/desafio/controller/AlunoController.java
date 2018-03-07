package br.ufms.desafio.controller;

import br.ufms.desafio.entity.Aluno;
import br.ufms.desafio.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping(path = "/aluno")
public class AlunoController extends JogadorBaseController<Aluno> {

//    @Autowired
//    private AlunoService alunoService;
//
//    @RequestMapping(method = RequestMethod.POST)
//    public Object salvar(@RequestBody Aluno aluno) {
//        return alunoService.save(aluno);
//    }
//
//    @RequestMapping(method = RequestMethod.DELETE)
//    public void excluir(@PathParam("id") Long id) {
//        alunoService.delete(id);
//    }

}
