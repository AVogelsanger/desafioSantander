package br.com.desafiosantander.desafioSantander.dto;

import br.com.desafiosantander.desafioSantander.entities.CepResponse;
import br.com.desafiosantander.desafioSantander.entities.TheaterRoom;
import br.com.desafiosantander.desafioSantander.services.CepResponseService;

import java.io.IOException;

public class TheaterRoomDTO {

    private Long id;
    private String screen;
    private String name;
    private String zipCode;
//	private String[][] seat;

    private CepResponse endereco;

    public TheaterRoomDTO() { }
    public TheaterRoomDTO(Long id, String screen, String name) {
        this.id = id;
        this.screen = screen;
        this.name = name;
    }

    public TheaterRoomDTO(TheaterRoom entity) {
        id = entity.getId();
        screen = entity.getScreen();
        name = entity.getName();
       // zipCode = entity.getZipCode();
        endereco = entity.getEndereco();
    }

    public TheaterRoomDTO(String screen, String name, CepResponse endereco) {
        this.screen = screen;
        this.name = name;
        this.endereco = endereco;
    }

    public TheaterRoomDTO(Long id, String screen, String name, String zipCode) throws IOException, InterruptedException {
        this.id = id;
        this.screen = screen;
        this.name = name;
        this.zipCode = zipCode;
    }

    public Long getId() {
        return id;
    }

    public String getScreen() {
        return screen;
    }

    public String getName() {
        return name;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public CepResponse getEndereco() { return endereco; }

    public void setEndereco(CepResponse endereco) {
        this.endereco = endereco;
    }
}
