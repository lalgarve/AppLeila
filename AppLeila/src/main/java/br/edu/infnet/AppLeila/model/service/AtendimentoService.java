
package br.edu.infnet.AppLeila.model.service;

import br.edu.infnet.AppLeila.model.domain.Atendimento;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

/**
 *
 * @author leila.algarve
 */
@Service
public class AtendimentoService {
    private static int id;
    private static Map<Integer, Atendimento> mapa = new HashMap<>();
    
    public void incluir(Atendimento atendimento){
        atendimento.setId(++id);
        mapa.put(id, atendimento);
    }
    
    public Collection<Atendimento> obterLista(){
        return mapa.values();
    }
}
