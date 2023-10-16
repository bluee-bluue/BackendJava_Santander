package dio.springboot.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class SistemaMensagens implements CommandLineRunner {
    private Remetente remetente;

    @Autowired
    public void setRemetente(Remetente remetente) {
        this.remetente = remetente;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("\nMensagem enviada por: " + remetente.getNome());
        System.out.println("E-mail: " + remetente.getEmail());
        System.out.println("Com telefones para contato: " + remetente.getTelefones());
        System.out.println("Seu cadastro foi aprovado!");
    }
}
