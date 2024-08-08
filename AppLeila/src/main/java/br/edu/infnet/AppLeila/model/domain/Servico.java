package br.edu.infnet.AppLeila.model.domain;

import jakarta.persistence.*;

/**
 *
 * @author leila.algarve
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private float preco;
    private boolean particular;

    @ManyToOne
    @JoinColumn(name="atendimento_id", nullable = false)
    private Atendimento atendimento;
                            
    public boolean isParticular(){
        return particular;
    }
    
    public void setParticular(boolean particular){
        this.particular = particular;
    }
    
    public float getPreco(){
        return preco;
    }
    
    public void setPreco(float preco){
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Atendimento getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(Atendimento atendimento) {
        this.atendimento = atendimento;
    }

    @Override
    public String toString() {
        return "Servico{" + "id=" + id + ", preco=" + preco + ", particular=" + particular + '}';
    }
    
    

    
}
