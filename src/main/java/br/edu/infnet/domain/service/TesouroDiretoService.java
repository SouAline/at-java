package br.edu.infnet.domain.service;

import br.edu.infnet.domain.model.TesouroDireto;
import br.edu.infnet.domain.repository.TesouroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TesouroDiretoService {

    @Autowired
    private TesouroRepository tesouroRepository;

    public List<TesouroDireto> obterLista() {
        return (List<TesouroDireto>) tesouroRepository.findAll();
    }

    public void incluir(TesouroDireto tesouroDireto){
      tesouroRepository.save(tesouroDireto);
    }

    public void excluir(Integer id){
       tesouroRepository.deleteById(id);
    }

    public TesouroDireto obterPorId(Integer id){
        return tesouroRepository.findById(id).orElse(null);
    }
}
