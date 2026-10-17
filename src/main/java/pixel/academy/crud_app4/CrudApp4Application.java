package pixel.academy.crud_app4;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudApp4Application {

	public static void main(String[] args) {
		SpringApplication.run(CrudApp4Application.class, args);

	}

	@Bean
	public CommandLineRunner commandLineRunner(String[] args) {

		return runner -> {
			System.out.println("Hello, word!");
		};

	}
}


