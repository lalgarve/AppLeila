package br.edu.infnet.AppLeila.model;

/**
 *
 * @author leila.algarve
 */
public class Servico {
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
}
