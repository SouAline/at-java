package br.edu.infnet.domain.repository;


import br.edu.infnet.domain.model.FundoImobiliario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FundoImobiliarioRepository extends CrudRepository<FundoImobiliario, Integer> {
}
