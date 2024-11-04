package br.com.desafiosantander.desafioSantander.controllers;

import br.com.desafiosantander.desafioSantander.dto.TheaterRoomDTO;
import br.com.desafiosantander.desafioSantander.entities.TheaterRoom;
import br.com.desafiosantander.desafioSantander.repositories.TheaterRoomRepository;
import br.com.desafiosantander.desafioSantander.services.TheaterRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.IOException;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/theaters")
public class TheaterRoomController {

    @Autowired
    private TheaterRoomService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<TheaterRoomDTO> findById(@PathVariable Long id){
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping()
    public ResponseEntity<Page<TheaterRoomDTO>> findAll(Pageable pageable){
        return ResponseEntity.ok(service.findAll(pageable));
    }

    @PostMapping()
    public ResponseEntity<TheaterRoomDTO> insert(@RequestBody TheaterRoomDTO dto) throws IOException, InterruptedException {
        dto = service.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id")
                .buildAndExpand(dto.getId())
                .toUri();
        return ResponseEntity.created(uri).body(dto);
    }


    @PutMapping(value = "/{id}")
    public ResponseEntity<TheaterRoomDTO> update(@PathVariable Long id, @RequestBody TheaterRoomDTO dto){
        return ResponseEntity.ok(service.update(id, dto));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

}
