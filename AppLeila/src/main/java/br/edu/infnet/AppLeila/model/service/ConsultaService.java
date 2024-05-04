
package br.edu.infnet.AppLeila.model.service;

import br.edu.infnet.AppLeila.model.domain.Consulta;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

/**
 *
 * @author leila.algarve
 */
@Service
public class ConsultaService {
    private static int id;
    private static Map<Integer, Consulta> mapa = new HashMap<>();
    
    public void incluir(Consulta consulta){
        consulta.setId(++id);
        mapa.put(id, consulta);
    }
    
    public Collection<Consulta> obterLista(){
        return mapa.values();
    }
}
