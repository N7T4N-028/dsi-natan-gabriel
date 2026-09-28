package Aula08;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Controller que responde às requisições HTTP devolvendo JSON
@RestController
public class WelcomeController {

    // Modelo da mensagem: o %s é substituído pelo nome recebido
    private static final String MODELO_MENSAGEM = "Hello, %s!";

    // Contador que gera um id novo a cada requisição
    private final AtomicLong contador = new AtomicLong();

    // Responde em GET /welcome?name=Natan
    @GetMapping("/welcome")
    public Welcome welcome(@RequestParam(name = "name", defaultValue = "World") String nome) {

        // Monta a mensagem com o nome recebido
        String mensagem = MODELO_MENSAGEM.formatted(nome);

        // Cria a resposta com o próximo id
        return new Welcome(contador.incrementAndGet(), mensagem);

    }
}
