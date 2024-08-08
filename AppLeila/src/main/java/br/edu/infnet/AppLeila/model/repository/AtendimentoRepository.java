package br.edu.infnet.AppLeila.model.repository;

import br.edu.infnet.AppLeila.model.domain.Atendimento;
import org.springframework.data.repository.ListCrudRepository;

public interface AtendimentoRepository extends ListCrudRepository<Atendimento, Long> {
}
