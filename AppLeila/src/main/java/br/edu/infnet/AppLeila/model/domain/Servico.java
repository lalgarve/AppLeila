package br.edu.infnet.AppLeila.model.domain;

/**
 *
 * @author leila.algarve
 */
public abstract class Servico {
    private Integer id;
    private float preco;
    private boolean particular;
                            
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Servico{" + "id=" + id + ", preco=" + preco + ", particular=" + particular + '}';
    }
    
    

    
}
