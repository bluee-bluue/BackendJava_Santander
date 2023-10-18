package DIO.PadroesDeProjeto_ComSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*
* http://localhost:8080/swagger-ui/index.html#/ - Testar API
* */

@EnableFeignClients
@SpringBootApplication
public class PadroesDeProjetoComSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadroesDeProjetoComSpringApplication.class, args);
	}

}
