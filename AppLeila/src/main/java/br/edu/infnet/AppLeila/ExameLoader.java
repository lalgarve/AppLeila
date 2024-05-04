package br.edu.infnet.AppLeila;

import br.edu.infnet.AppLeila.model.domain.Exame;
import br.edu.infnet.AppLeila.model.service.ExameService;
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
public class ExameLoader implements ApplicationRunner{
    
    @Autowired
    private ExameService service;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        FileReader file = new FileReader("arquivos/exame.txt");
        BufferedReader leitura = new BufferedReader(file);
        String linha = leitura.readLine();
        System.out.println("#Exame");

        while(linha != null){
            String[] campos = linha.split(";");
            
            Exame exame = new Exame();
            exame.setPreco(Float.parseFloat(campos[0]));
            exame.setParticular(Boolean.parseBoolean(campos[1]));
            exame.setNome(campos[2]);
            exame.setHorasJejum(Integer.parseInt(campos[3]));
            
            service.incluir(exame);
            
            linha = leitura.readLine();
        }
        
        service.obterLista().forEach(System.out::println);
        
    }
    
}
