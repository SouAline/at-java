package br.edu.infnet.domain.controller;

import br.edu.infnet.domain.model.FundoImobiliario;
import br.edu.infnet.domain.service.FundoImobiliarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FundoImobiliarioController {

    @Autowired
    private FundoImobiliarioService fundoImobiliarioService;

    @GetMapping(value = "fundoImolibiario/lista")
    public String telaLista(Model model){
        model.addAttribute("fundoImobiliario", fundoImobiliarioService.obterLista());
        return "/fundoImobiliario/lista";
    }
    @GetMapping(value = "/cadastramento")
    public String cadastro(){
        return "/fundoImobiliario/lista";
    }

    @GetMapping(value = "fundoImobiliario/cadastro")
    public String telacadastro(){
        return "/fundoImobiliario/cadastro";
    }

    @PostMapping(value = "/fundoImobiliario/incluir")
    public String incluir(Model model, FundoImobiliario fundoImobiliario){
        fundoImobiliarioService.incluir(fundoImobiliario);
        model.addAttribute("mensagem", "O fundo imobiliário " + fundoImobiliario.getNome() + " foi cadastrado com sucesso!");
        return telaLista(model);
    }

    @GetMapping(value = "/fundoImobiliario/{id}/excluir")
    public String excluir(Model model, @PathVariable Integer id){
        FundoImobiliario fundoImobiliario = fundoImobiliarioService.obterPorId(id);
        fundoImobiliarioService.excluir(id);
        model.addAttribute("mensagem", "O fundo imobiliario " + fundoImobiliario.getNome() + "foi excluido com sucesso!!");
        return telaLista(model);
    }

}
