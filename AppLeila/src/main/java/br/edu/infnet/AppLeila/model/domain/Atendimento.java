package br.edu.infnet.AppLeila.model.domain;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author leila.algarve
 */
public class Atendimento {
    private Integer id;
    private LocalDateTime dataHora;
    private String convenio;
    private List<Servico> servicos;
    
    public LocalDateTime getDataHora(){
        return dataHora;
    }
    
    public void setDataHora(LocalDateTime dataHora){
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Atendimento{" + "id=" + id + ", dataHora=" + dataHora + ", convenio=" + convenio + ", servicos=" + servicos + '}';
    }


    
    
}
