/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.infnet.AppLeila;

import br.edu.infnet.AppLeila.model.domain.Atendimento;
import br.edu.infnet.AppLeila.model.domain.Consulta;
import br.edu.infnet.AppLeila.model.domain.Exame;
import br.edu.infnet.AppLeila.model.service.AtendimentoService;
import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import br.edu.infnet.AppLeila.model.service.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author leila.algarve
 */
@Component
public class AtendimentoLoader implements ApplicationRunner{
    
    @Autowired
    private AtendimentoService atendimentoService;
    @Autowired
    private ServicoService servicoService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        FileReader file = new FileReader("arquivos/atendimento.txt");
        BufferedReader leitura = new BufferedReader(file);
        String linha = leitura.readLine();
        System.out.println("#Atendimento");
        Atendimento atendimento = null;
        while(linha != null) {
            String[] campos = linha.split(";");
            switch (campos[0].toLowerCase()) {
                case "a" -> {
                    atendimento = new Atendimento();
                    LocalDateTime dataHora = LocalDateTime.parse(campos[1], DateTimeFormatter.ISO_LOCAL_DATE_TIME);
                    atendimento.setDataHora(dataHora);
                    boolean temConvenio = campos.length > 2 && !campos[2].isBlank();
                    atendimento.setConvenio(temConvenio ? campos[2] : null);
                    atendimento = atendimentoService.incluir(atendimento);
                    linha = leitura.readLine();
                }
                case "e" -> {
                    Exame exame = new Exame();
                    exame.setPreco(Float.parseFloat(campos[1]));
                    exame.setParticular(Boolean.parseBoolean(campos[2]));
                    exame.setNome(campos[3]);
                    exame.setHorasJejum(Integer.parseInt(campos[4]));
                    exame.setAtendimento(atendimento);
                    servicoService.incluir(exame);
                }
                case "c" -> {
                    Consulta consulta = new Consulta();
                    consulta.setPreco(Float.parseFloat(campos[1]));
                    consulta.setParticular(Boolean.valueOf(campos[2]));
                    consulta.setCRM(campos[3]);
                    consulta.setMedico(campos[4]);
                    consulta.setEspecialidade(campos[5]);
                    consulta.setAtendimento(atendimento);
                    servicoService.incluir(consulta);
                }
            }
            linha = leitura.readLine();
        }
        atendimentoService.obterLista().forEach(System.out::println);


    }
    
}
