package br.com.desafiosantander.desafioSantander.entities;

import jakarta.persistence.*;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

@Entity
@Table(name = "tb_theater_room")
public class TheaterRoom {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String screen;
	private String name;
//	private String[][] seat;

	@OneToOne(mappedBy = "theaterRoom", cascade = CascadeType.ALL)
	private CepResponse endereco;

	public TheaterRoom() {
	}

//	public TheaterRoom(Long id, String screenType, String nameRoom) {
//		this.id = id;
//		this.screenType = screenType;
//		this.nameRoom = nameRoom;
//	}

	public TheaterRoom(Long id, String screen, String name, CepResponse endereco) {
		this.id = id;
		this.screen = screen;
		this.name = name;
		// this.seat = seat;
		this.endereco = endereco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getScreen() {
		return screen;
	}

	public void setScreen(String screen) {
		this.screen = screen;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
//	public String[][] getSeat() {
//		return seat;
//	}
//
//	public void setSeat(String[][] seat) {
//		this.seat = seat;
//	}

	public CepResponse getEndereco() {
		return endereco;
	}

	public void setEndereco(CepResponse endereco) {
		this.endereco = endereco;
	}


//	public String[][] quantitySeat(int line, int column) {
//		String[] alpha = { "A", "B", "C", "D", "E", "F", "G", "H", "I",
//									"J", "K", "L", "M", "N", "O", "P", "Q", "R",
//												"S", "T", "U", "V", "W", "X", "Y", "Z" };
//		seat = new String[line][column];
//
//		for (int i = 0; i < line; i++) {
//			for (int j = 0; j < column; j++) {
//				seat[i][j] = alpha[i] + "-" + (j + 1);
//			}
//		}
//		return seat;
//	}

	@Override 
	public String toString() { 
		StringBuilder ticket = new StringBuilder();
		ticket.append("\n*** TICKET ***");
		ticket.append("\n ************ ");
		ticket.append("\nCodigo: " + id);
		ticket.append("\n ************ ");
		ticket.append("\nTipo da tela: " + screen);
		ticket.append("\n ************ ");
		ticket.append("\nNome da sala: " + name);
		ticket.append("\n ************ ");
		ticket.append("\nEndereço: " + endereco.getLogradouro());
		ticket.append("\n ************ ");
		
//		for (String[] s : seat) {
//			ticket.append("\n" + Arrays.toString(s));
//		}
//		ticket.append("\nDistribuição das poltronas");
//		ticket.append("\n" + Arrays.stream(seat).map(Arrays::toString).collect(Collectors.joining(System.lineSeparator())));
		
		return ticket.toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		TheaterRoom that = (TheaterRoom) o;

        return Objects.equals(id, that.id);
    }

	@Override
	public int hashCode() {
		return id != null ? id.hashCode() : 0;
	}
}
