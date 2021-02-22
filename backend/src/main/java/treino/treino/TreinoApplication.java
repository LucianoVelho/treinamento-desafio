package treino.treino;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@PropertySources({
		@PropertySource("classpath:application.properties"),
})
public class TreinoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TreinoApplication.class, args);
	}

}
