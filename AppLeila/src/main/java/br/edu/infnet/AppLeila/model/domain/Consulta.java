package br.edu.infnet.AppLeila.model.domain;

/**
 *
 * @author leila.algarve
 */
public class Consulta extends Servico{
    private String CRM;
    private String medico;
    private String especialidade;

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return super.toString() + " Consulta{" + "CRM=" + CRM + ", medico=" + medico + ", especialidade=" + especialidade + '}';
    }
    
    
}
