package br.edu.infnet.AppLeila;

import br.edu.infnet.AppLeila.model.domain.Consulta;
import br.edu.infnet.AppLeila.model.domain.Exame;
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
public class ExameLoader implements ApplicationRunner{

    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<Exame> lista = new ArrayList<>();
        FileReader file = new FileReader("exame.txt");
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
            
            lista.add(exame);
            
            linha = leitura.readLine();
        }
        
        lista.forEach(System.out::println);
        
    }
    
}
