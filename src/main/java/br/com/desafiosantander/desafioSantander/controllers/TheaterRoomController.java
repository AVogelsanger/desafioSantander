package br.com.desafiosantander.desafioSantander.controllers;

import br.com.desafiosantander.desafioSantander.dto.TheaterRoomDTO;
import br.com.desafiosantander.desafioSantander.entities.TheaterRoom;
import br.com.desafiosantander.desafioSantander.repositories.TheaterRoomRepository;
import br.com.desafiosantander.desafioSantander.services.TheaterRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/theaters")
public class TheaterRoomController {

    @Autowired
    private TheaterRoomService service;
    @GetMapping(value = "/{id}")
    public TheaterRoomDTO findById(@PathVariable Long id){
        return service.findById(id);
    }

    @GetMapping()
    public Page<TheaterRoomDTO> findAll(Pageable pageable){
        return service.findAll(pageable);
    }

    @PostMapping()
    public TheaterRoomDTO insert(@RequestBody TheaterRoomDTO dto){
        return service.insert(dto);
    }
}
