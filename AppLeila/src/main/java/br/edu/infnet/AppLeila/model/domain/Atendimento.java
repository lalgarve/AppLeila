package br.edu.infnet.AppLeila.model.domain;

import java.time.LocalTime;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author leila.algarve
 */
public class Atendimento {
    private LocalTime dataHora;
    private String convenio;
    private List<Servico> servicos;
    
    public LocalTime getDataHora(){
        return dataHora;
    }
    
    public void setDataHora(LocalTime dataHora){
        this.dataHora = dataHora;
    }
    
    public String getConvenio(){
        return convenio;
    }
    
    public void setConvenio(String convenio){
        this.convenio = convenio;
    }
    
    public List<Servico> getServicos(){
        return Collections.unmodifiableList(servicos);
    }

    @Override
    public String toString() {
        return "Atendimento{" + "data=" + dataHora + ", convenio=" + convenio + ", servicos=" + servicos + '}';
    }
    
    
}
