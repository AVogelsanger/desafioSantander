package br.com.desafiosantander.desafioSantander.dto;

import br.com.desafiosantander.desafioSantander.entities.CepResponse;
import br.com.desafiosantander.desafioSantander.entities.TheaterRoom;

public class TheaterRoomDTO {

    private Long id;
    private String screen;
    private String name;
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
        endereco = entity.getEndereco();
    }

    public TheaterRoomDTO(String screen, String name, CepResponse endereco) {
        this.screen = screen;
        this.name = name;
        this.endereco = endereco;
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

    public CepResponse getEndereco() { return endereco; }

//    public void setEndereco(CepResponse endereco) {
//        this.endereco = endereco;
//    }
}
