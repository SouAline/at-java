package br.edu.infnet.controller;

import br.edu.infnet.domain.model.Usuario;
import br.edu.infnet.domain.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpSession;

@SessionAttributes("user")
@Controller
public class AcessoController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping(value = "/")
    public String telaLogin() {
        return "/login";

    }

    @GetMapping(value="/login")
    public String telaHome(){
        return "index";
    }

    @GetMapping(value="/logout")
    public String logout(HttpSession session, SessionStatus status){
        status.setComplete();
        session.removeAttribute("user");
        return  "redirect:/";
    }

    @PostMapping(value = "/home")
    public String login(Model model, @RequestParam String email, @RequestParam String senha) {

        Usuario usuario = usuarioService.validacao(email, senha);

        if (usuario != null) {
            model.addAttribute("user", usuario);
            return "/index";

        } else {
            model.addAttribute("mensagem", "Email e/ou senha inválida!");

            return "/login";
        }
    }

    @GetMapping(value = "/usuario/cadastro")
    public String criarUsuario() {
        return "/usuario/cadastro";
    }


    @PostMapping(value = "/usuario/cadastro")
    public String cadastrar(Model model, Usuario usuario) {

        usuarioService.registrar(usuario);

        model.addAttribute("mensagem", "O usuário " + usuario.getNome() + " foi cadastrado com sucesso!");

        return "/login";
    }
}