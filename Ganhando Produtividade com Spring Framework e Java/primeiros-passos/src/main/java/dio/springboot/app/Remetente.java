package dio.springboot.app;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "remetente")
public class Remetente {
    private String nome = "Caique Silva";

    private String email = "scaique080@gmail.com";

    private List<Long> telefones = new ArrayList<>(Arrays.asList(new Long[]{11956224580L}));

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Long> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Long> telefones) {
        this.telefones = telefones;
    }
}
