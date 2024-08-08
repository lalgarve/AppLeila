/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.infnet.AppLeila.model.service;

import br.edu.infnet.AppLeila.model.domain.Servico;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.edu.infnet.AppLeila.model.repository.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author leila.algarve
 */
@Service
public class ServicoService {
    @Autowired
    private ServicoRepository servicoRepository;
    
    public Servico incluir(Servico servico){
        return servicoRepository.save(servico);
    }
    
    public List<Servico> obterLista(){
        return servicoRepository.findAll();
    }
}
