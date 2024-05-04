package br.edu.infnet.AppLeila.model;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author leila.algarve
 */
public class Atendimento {
    private LocalDate data;
    private String convenio;
    private List<Servico> servicos;
    
    public LocalDate getData(){
        return data;
    }
    
    public void setData(LocalDate data){
        this.data = data;
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
    
}
