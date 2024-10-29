package br.com.desafiosantander.desafioSantander.services;

import br.com.desafiosantander.desafioSantander.dto.TheaterRoomDTO;
import br.com.desafiosantander.desafioSantander.entities.CepResponse;
import br.com.desafiosantander.desafioSantander.entities.TheaterRoom;
import br.com.desafiosantander.desafioSantander.repositories.CepResponseRepository;
import br.com.desafiosantander.desafioSantander.repositories.TheaterRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class TheaterRoomService {

    @Autowired
    private TheaterRoomRepository repository;

    @Autowired
    private CepResponseRepository cepResponseRepository;

    @Transactional(readOnly = true)
    public TheaterRoomDTO findById(Long id) {
        TheaterRoom theaterRoom = repository.findById(id).get();
        return new TheaterRoomDTO(theaterRoom);
    }

    @Transactional(readOnly = true)
    public Page<TheaterRoomDTO> findAll(Pageable pageable) {
        Page<TheaterRoom> result = repository.findAll(pageable);
        return result.map(x -> new TheaterRoomDTO(x));
    }

    @Transactional
    public TheaterRoomDTO insert(TheaterRoomDTO dto) {
        CepResponse cep = cepResponseRepository.save(dto.getEndereco());

        TheaterRoom entity = new TheaterRoom();
        entity.setName(dto.getName());
        entity.setScreen(dto.getScreen());
        entity.setEndereco(cep);
        entity = repository.save(entity);
        return new TheaterRoomDTO(entity);
    }

    @Transactional
    public TheaterRoomDTO update(Long id, TheaterRoomDTO dto) {
        TheaterRoom entity = repository.getReferenceById(id);

        entity.setName(dto.getName());
        entity.setScreen(dto.getScreen());
        entity.setEndereco(entity.getEndereco());
        entity = repository.save(entity);
        return new TheaterRoomDTO(entity);
    }

    @Transactional
    public void delete(Long id) {
        repository.deleteById(id);
    }

}
