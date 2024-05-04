/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.infnet.AppLeila.model.service;

import br.edu.infnet.AppLeila.model.domain.Servico;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

/**
 *
 * @author leila.algarve
 */
@Service
public class ServicoService {
    private static int id;
    private static Map<Integer, Servico> mapa = new HashMap<>();
    
    public void incluir(Servico servico){
        servico.setId(++id);
        mapa.put(id, servico);
    }
    
    public Collection<Servico> obterLista(){
        return mapa.values();
    }
}
