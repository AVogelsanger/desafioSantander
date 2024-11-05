package br.com.desafiosantander.desafioSantander.services;

import br.com.desafiosantander.desafioSantander.dto.TheaterRoomDTO;
import br.com.desafiosantander.desafioSantander.entities.TheaterRoom;
import br.com.desafiosantander.desafioSantander.repositories.CepResponseRepository;
import br.com.desafiosantander.desafioSantander.repositories.TheaterRoomRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class TheaterRoomServiceTest {

    @InjectMocks
    private TheaterRoomService service;
    @Mock
    private TheaterRoomRepository repository;
    @Mock
    private CepResponseRepository cepResponseRepository;
    private TheaterRoom theaterRoom;
    private TheaterRoomDTO theaterRoomDTO;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        theaterRoom = new TheaterRoom();
        theaterRoom.setId(1L);
        theaterRoom.setName("Room 1");
        theaterRoom.setScreen("Screen 1");
        theaterRoomDTO = new TheaterRoomDTO(1L, "Room 1", "Screen 1");
    }

    @Test
    public void testInsert() {
        
    }

    @Test
    public void testUpdate() {

        when(repository.getReferenceById(any(Long.class))).thenReturn(theaterRoom);
        when(repository.save(any(TheaterRoom.class))).thenReturn(theaterRoom);

        TheaterRoomDTO updatedDTO = service.update(1L, theaterRoomDTO);
        assertEquals(theaterRoomDTO.getName(), "blablabla");
        assertEquals(theaterRoomDTO.getScreen(), updatedDTO.getScreen());
        verify(repository, times(1)).getReferenceById(1L);
        verify(repository, times(1)).save(theaterRoom);
    }
}