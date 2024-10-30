package br.com.desafiosantander.desafioSantander.repositories;

import br.com.desafiosantander.desafioSantander.entities.CepResponse;
import com.google.gson.Gson;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public interface CepResponseRepository extends JpaRepository<CepResponse, Long> {

}
