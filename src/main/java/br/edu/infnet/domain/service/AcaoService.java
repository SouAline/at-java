package br.edu.infnet.domain.service;

import br.edu.infnet.domain.model.Acao;
import br.edu.infnet.domain.repository.AcaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcaoService {

    @Autowired
    private AcaoRepository acaoRepository;

    public List<Acao> obterLista(){
        return (List<Acao>) acaoRepository.findAll();
    }

    public void incluir(Acao acao){
        acaoRepository.save(acao); //vai no repository pedir pra salvar no banco
    }

    public void excluir(Integer id){
        acaoRepository.deleteById(id);//vai no repository e pede pra deletar no banco através do id
    }

    public Acao obterPorId(Integer id){
        return acaoRepository.findById(id).orElse(null);
    }
}
