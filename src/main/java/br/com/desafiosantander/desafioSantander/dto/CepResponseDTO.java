package br.com.desafiosantander.desafioSantander.dto;

import br.com.desafiosantander.desafioSantander.entities.CepResponse;
import br.com.desafiosantander.desafioSantander.entities.TheaterRoom;

public class CepResponseDTO {

    private Long id;
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String ibge;

    private TheaterRoom theaterRoom;

    public CepResponseDTO(CepResponse entity) {
        id = entity.getId();
        cep = entity.getCep();
        logradouro = entity.getLogradouro();
        complemento = entity.getComplemento();
        bairro = entity.getBairro();
        localidade = entity.getLocalidade();
        uf = entity.getUf();
        ibge = entity.getIbge();
    }

    public CepResponseDTO(Long id, String cep, String logradouro, String complemento, String bairro, String localidade, String uf, String ibge) {
        this.id = id;
        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.localidade = localidade;
        this.uf = uf;
        this.ibge = ibge;
    }

    public Long getId() {
        return id;
    }

    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getUf() {
        return uf;
    }

    public String getIbge() {
        return ibge;
    }
}
