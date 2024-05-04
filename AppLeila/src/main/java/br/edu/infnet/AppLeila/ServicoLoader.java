
package br.edu.infnet.AppLeila;

import br.edu.infnet.AppLeila.model.domain.Consulta;
import br.edu.infnet.AppLeila.model.domain.Exame;
import br.edu.infnet.AppLeila.model.service.ServicoService;
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
public class ServicoLoader implements ApplicationRunner{
    @Autowired
    private ServicoService service;
    
    @Override
    public void run(ApplicationArguments args) throws Exception {
        FileReader file = new FileReader("arquivos/servico.txt");
        BufferedReader leitura = new BufferedReader(file);
        String linha = leitura.readLine();
        System.out.println("#Servico");
        while(linha != null){
            String[] campos = linha.split(";");
            switch(campos[0].toLowerCase()){
                case "e" -> {
                    Exame exame = new Exame();
                    exame.setPreco(Float.parseFloat(campos[1]));
                    exame.setParticular(Boolean.parseBoolean(campos[2]));
                    exame.setNome(campos[3]);
                    exame.setHorasJejum(Integer.parseInt(campos[4]));
                    service.incluir(exame);
                }
                case "c" -> {
                    Consulta consulta = new Consulta();
                    consulta.setPreco(Float.parseFloat(campos[1]));
                    consulta.setParticular(Boolean.valueOf(campos[2]));
                    consulta.setCRM(campos[3]);
                    consulta.setMedico(campos[4]);
                    consulta.setEspecialidade(campos[5]);
                    service.incluir(consulta);
                }
            }

            linha = leitura.readLine();
        }
        
        service.obterLista().forEach(System.out::println);
        
    }
    
}
