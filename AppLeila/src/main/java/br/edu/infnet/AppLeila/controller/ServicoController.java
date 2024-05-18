package br.edu.infnet.AppLeila.controller;

import br.edu.infnet.AppLeila.model.domain.Servico;
import br.edu.infnet.AppLeila.model.service.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class ServicoController {
    @Autowired
    private ServicoService service;

    @GetMapping("/servico/lista")
    public Collection<Servico> obterLista(){
        return service.obterLista();
    }

    //obterPorId(Integer id)  servico/{id}
    //incluir(Servico servico) servico/incluir
     //public void incluir(Servico servico)
    //exclusao(Integer id)  servico/{id}/excluir
}
