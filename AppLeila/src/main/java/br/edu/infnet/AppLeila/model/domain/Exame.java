package br.edu.infnet.AppLeila.model.domain;

/**
 *
 * @author leila.algarve
 */
public class Exame extends Servico{
    private String nome;
    private int horasJejum;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHorasJejum() {
        return horasJejum;
    }

    public void setHorasJejum(int horasJejum) {
        this.horasJejum = horasJejum;
    }

    @Override
    public String toString() {
        return super.toString() + " Exame{" + "nome=" + nome + ", horasJejum=" + horasJejum + '}';
    }
    
    
}
