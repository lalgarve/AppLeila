
package br.edu.infnet.AppLeila;

import br.edu.infnet.AppLeila.model.domain.Consulta;
import br.edu.infnet.AppLeila.model.service.ConsultaService;
import java.io.BufferedReader;
import java.io.FileReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author leila.algarve
 */
@Component
public class ConsultaLoader implements ApplicationRunner{

    @Autowired
    private ConsultaService service;
    
    @Override
    public void run(ApplicationArguments args) throws Exception {
        FileReader file = new FileReader("consulta.txt");
        BufferedReader leitura = new BufferedReader(file);
        String linha = leitura.readLine();
        System.out.println("#Consulta");
        while(linha != null){
            String[] campos = linha.split(";");
            
            Consulta consulta = new Consulta();
            consulta.setPreco(Float.parseFloat(campos[0]));
            consulta.setParticular(Boolean.valueOf(campos[1]));
            consulta.setCRM(campos[2]);
            consulta.setMedico(campos[3]);
            consulta.setEspecialidade(campos[4]);
            
            service.incluir(consulta);
            linha = leitura.readLine();
        }
        
        service.obterLista().forEach(System.out::println);
        
    }
    
}
