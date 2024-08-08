
package br.edu.infnet.AppLeila.model.service;

import br.edu.infnet.AppLeila.model.domain.Consulta;
import br.edu.infnet.AppLeila.model.repository.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author leila.algarve
 */
@Service
public class ConsultaService {
    @Autowired
    private ConsultaRepository consultaRepository;
    
    public Consulta incluir(Consulta consulta){
        return consultaRepository.save(consulta);
    }
    
    public List<Consulta> obterLista(){
        return consultaRepository.findAll();
    }
}
