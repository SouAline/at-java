package br.edu.infnet.domain.controller;

import br.edu.infnet.domain.model.TesouroDireto;
import br.edu.infnet.domain.service.TesouroDiretoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TesouroDiretoController {

    @Autowired
    private TesouroDiretoService tesouroDiretoService;

    @GetMapping(value = "tesouroDireto/cadastro")
    public String telaCadastro(){
        return "/tesouroDireto/cadastro";
    }

    @GetMapping(value="tesouroDireto/lista")
    public String telaLista(Model model){
      model.addAttribute("tesouroDireto", tesouroDiretoService.obterLista());
    return "tesouroDireto/lista";
    }

    @PostMapping(value="/tesouroDireto/incluir")
    public String incluir(Model model, TesouroDireto tesouroDireto){
        tesouroDiretoService.incluir(tesouroDireto);
        model.addAttribute("mensagem", "O tesouro direto" + tesouroDireto.getNome() + " foi cadastrado com sucesso!!");
        return telaLista(model);
    }
    @GetMapping(value = "cadastrar")
    public String cadastrar(){
        return telaCadastro();
    }

    @GetMapping(value = "/tesouroDireto/{id}/excluir")
    public String excluir(Model model, @PathVariable Integer id){
        TesouroDireto tesouroDireto = tesouroDiretoService.obterPorId(id);
        tesouroDiretoService.excluir(id);
        model.addAttribute("mensagem", "O tesouro direto " + tesouroDireto.getNome() + " foi excluido com sucesso!");
        return telaLista(model);
    }
}
