package Aula08;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Classe principal: configura e inicia a aplicação Spring Boot
@SpringBootApplication
public class RestServiceApplication {

    public static void main(String[] args) {

        // Inicia o servidor embutido (porta 8080 por padrão)
        SpringApplication.run(RestServiceApplication.class, args);

    }
}
