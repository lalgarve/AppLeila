
package br.edu.infnet.AppLeila;

import br.edu.infnet.AppLeila.model.domain.Consulta;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author leila.algarve
 */
@Component
public class ConsultaLoader implements ApplicationRunner{

    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<Consulta> lista = new ArrayList<>();
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
            
            lista.add(consulta);
            linha = leitura.readLine();
        }
        
        lista.forEach(System.out::println);
        
    }
    
}
