
package br.edu.infnet.AppLeila.model.service;

import br.edu.infnet.AppLeila.model.domain.Exame;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

/**
 *
 * @author leila.algarve
 */
@Service
public class ExameService {
    private static int id;
    private static Map<Integer, Exame> mapa = new HashMap<>();
    
    public void incluir(Exame exame){
        exame.setId(++id);
        mapa.put(id, exame);
    }
    
    public Collection<Exame> obterLista(){
        return mapa.values();
    }
}
