package br.edu.infnet.AppLeila.model.domain;

import jakarta.persistence.*;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leila.algarve
 */

@Entity
public class Atendimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dataHora;
    private String convenio;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "atendimento")
    private List<Servico> servicos;

    public Atendimento(){
        this.servicos = new ArrayList<>();
    }
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
        return servicos;
    }

    public void setServicos(List<Servico> servicos){
        this.servicos = servicos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Atendimento{" + "id=" + id + ", dataHora=" + dataHora + ", convenio=" + convenio
                + ", servicos=" + servicos.size()+ '}';
    }


    
    
}
