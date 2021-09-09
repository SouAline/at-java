package br.edu.infnet.domain.repository;

import br.edu.infnet.domain.model.Acao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcaoRepository extends CrudRepository<Acao, Integer> {
}
