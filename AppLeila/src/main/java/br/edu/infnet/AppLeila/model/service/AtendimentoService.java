
package br.edu.infnet.AppLeila.model.service;

import br.edu.infnet.AppLeila.model.domain.Atendimento;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.edu.infnet.AppLeila.model.repository.AtendimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author leila.algarve
 */
@Service
public class AtendimentoService {
    @Autowired
    private AtendimentoRepository repository;
    
    public Atendimento incluir(Atendimento atendimento){
        return repository.save(atendimento);
    }
    
    public List<Atendimento> obterLista(){
        return repository.findAll();
    }
}
