
package br.edu.infnet.AppLeila;

import br.edu.infnet.AppLeila.model.domain.Atendimento;
import br.edu.infnet.AppLeila.model.domain.Consulta;
import br.edu.infnet.AppLeila.model.domain.Exame;
import br.edu.infnet.AppLeila.model.domain.Servico;
import java.io.BufferedReader;
import java.io.FileReader;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author leila.algarve
 */
@Component
public class ServicoLoader implements ApplicationRunner{

    @Override
    public void run(ApplicationArguments args) throws Exception {
        FileReader file = new FileReader("servico.txt");
        BufferedReader leitura = new BufferedReader(file);
        String linha = leitura.readLine();
        System.out.println("#Servico");
        while(linha != null){
            String[] campos = linha.split(";");
            Servico servico;
            switch(campos[0].toLowerCase()){
                case "e":
                    Exame exame = new Exame();
                    exame.setPreco(Float.parseFloat(campos[1]));
                    exame.setParticular(Boolean.parseBoolean(campos[2]));
                    exame.setNome(campos[3]);
                    exame.setHorasJejum(Integer.parseInt(campos[4]));
                    servico=exame;
                    break;
                case "c":
                    Consulta consulta = new Consulta();
                    consulta.setPreco(Float.parseFloat(campos[1]));
                    consulta.setParticular(Boolean.valueOf(campos[2]));
                    consulta.setCRM(campos[3]);
                    consulta.setMedico(campos[4]);
                    consulta.setEspecialidade(campos[5]);
                    servico=consulta;
                    break;
                default:
                    servico = null;
            }

            
            System.out.println(servico);
            linha = leitura.readLine();
        }
        
    }
    
}
