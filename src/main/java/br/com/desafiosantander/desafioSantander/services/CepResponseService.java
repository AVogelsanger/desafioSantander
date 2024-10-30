package br.com.desafiosantander.desafioSantander.services;

import br.com.desafiosantander.desafioSantander.dto.CepResponseDTO;
import br.com.desafiosantander.desafioSantander.entities.CepResponse;
import br.com.desafiosantander.desafioSantander.repositories.CepResponseRepository;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CepResponseService {

    @Autowired
    private CepResponseRepository repository;


    @Transactional(readOnly = true)
    public CepResponseDTO findById(Long id) {
        CepResponse cepResponse = repository.findById(id).get();
        return new CepResponseDTO(cepResponse);
    }

    @Transactional(readOnly = true)
    public Page<CepResponseDTO> findAll(Pageable pageable) {
        Page<CepResponse> result = repository.findAll(pageable);
        return result.map(x -> new CepResponseDTO(x));
    }

    @Transactional()
    public CepResponseDTO insert(CepResponseDTO dto) {
        CepResponse entity = new CepResponse();
        entity.setId(dto.getId());
        entity.setCep(dto.getCep());
        entity.setBairro(dto.getBairro());
        entity.setLogradouro(dto.getLogradouro());
        entity.setComplemento(dto.getComplemento());
        entity.setLocalidade(dto.getLocalidade());
        entity.setIbge(dto.getIbge());
        entity = repository.save(entity);
        return new CepResponseDTO(entity);
    }


    public static CepResponse buscarCep(String cep) throws IOException, InterruptedException {
        String url = "http://viacep.com.br/ws/" + cep + "/json/";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String jsonResponse = response.body();

        // Usando Gson para converter o JSON em um objeto Java
        Gson gson = new Gson();
        return gson.fromJson(jsonResponse, CepResponse.class);
    }

}
