package br.edu.infnet.domain.service;

import br.edu.infnet.domain.model.Usuario;
import br.edu.infnet.domain.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario validacao(String email, String senha) {
        return usuarioRepository.autenticacao(email, senha);
    }

    public void registrar(Usuario usuario) {
        usuarioRepository.save(usuario);
    }
}
