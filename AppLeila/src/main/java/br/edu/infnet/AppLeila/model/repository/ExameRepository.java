package br.edu.infnet.AppLeila.model.repository;

import br.edu.infnet.AppLeila.model.domain.Atendimento;
import br.edu.infnet.AppLeila.model.domain.Exame;
import org.springframework.data.repository.ListCrudRepository;

public interface ExameRepository extends ListCrudRepository<Exame,Long> {
}
