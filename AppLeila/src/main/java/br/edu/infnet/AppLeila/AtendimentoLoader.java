/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.infnet.AppLeila;

import br.edu.infnet.AppLeila.model.domain.Atendimento;
import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author leila.algarve
 */
@Component
public class AtendimentoLoader implements ApplicationRunner{

    @Override
    public void run(ApplicationArguments args) throws Exception {
        FileReader file = new FileReader("atendimento.txt");
        BufferedReader leitura = new BufferedReader(file);
        String linha = leitura.readLine();
        System.out.println("#Atendimento");
        while(linha != null){
            String[] campos = linha.split(";");
            LocalTime dataHora = LocalTime.parse(campos[0], DateTimeFormatter.ISO_LOCAL_DATE_TIME);
            
            Atendimento atendimento = new Atendimento();            
            atendimento.setDataHora(dataHora);
            boolean temConvenio = campos.length>1 && !campos[1].isBlank();
            atendimento.setConvenio(temConvenio?campos[1]:null);
            
            System.out.println(atendimento);
            linha = leitura.readLine();
        }
        
    }
    
}
