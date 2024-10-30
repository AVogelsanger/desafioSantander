package br.com.desafiosantander.desafioSantander;

import br.com.desafiosantander.desafioSantander.entities.CepResponse;
import br.com.desafiosantander.desafioSantander.entities.Customer;
import br.com.desafiosantander.desafioSantander.services.CepResponseService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class DesafioSantanderApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DesafioSantanderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello world!");
		//CepResponseService responseService ;

		try {

			// Busca o CEP usando o serviço de CEP
			CepResponse endereco = CepResponseService.buscarCep("04297-000");

			System.out.println(endereco);

		} catch (IOException | InterruptedException e) {
			System.out.println("Erro ao buscar o CEP: " + e.getMessage());
		}

	}
}
