
package br.edu.infnet.AppLeila.model.service;

import br.edu.infnet.AppLeila.model.domain.Exame;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.edu.infnet.AppLeila.model.repository.ExameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author leila.algarve
 */
@Service
public class ExameService {
    @Autowired
    private ExameRepository exameRepository;
    
    public Exame incluir(Exame exame){
        return exameRepository.save(exame);
    }
    
    public List<Exame> obterLista(){
        return exameRepository.findAll();
    }
}
