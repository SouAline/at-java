package br.edu.infnet.atjava;

import br.edu.infnet.controller.AcessoController;
import br.edu.infnet.domain.service.UsuarioService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackageClasses = {AcessoController.class, UsuarioService.class})
@EntityScan(basePackages = {"br.edu.infnet.domain.model"})
@EnableJpaRepositories(basePackages = {"br.edu.infnet.domain.repository"})
public class AtJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AtJavaApplication.class, args);
    }

}
