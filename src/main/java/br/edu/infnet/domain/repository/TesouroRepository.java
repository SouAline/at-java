package br.edu.infnet.domain.repository;

import br.edu.infnet.domain.model.TesouroDireto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TesouroRepository extends CrudRepository<TesouroDireto, Integer> {

}
