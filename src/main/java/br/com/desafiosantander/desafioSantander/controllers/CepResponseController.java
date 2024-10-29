package br.com.desafiosantander.desafioSantander.controllers;

import br.com.desafiosantander.desafioSantander.dto.CepResponseDTO;
import br.com.desafiosantander.desafioSantander.dto.TheaterRoomDTO;
import br.com.desafiosantander.desafioSantander.entities.CepResponse;
import br.com.desafiosantander.desafioSantander.services.CepResponseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/ceps")
public class CepResponseController {

    private CepResponseService service;

    @GetMapping(value = "/{id}")
    public CepResponseDTO findById(@PathVariable Long id){
        return service.findById(id);
    }

    @GetMapping()
    public Page<CepResponseDTO> findAll(Pageable pageable){
        return service.findAll(pageable);
    }

    @PostMapping()
    public CepResponseDTO insert(@RequestBody CepResponseDTO dto){
        return service.insert(dto);
    }
}
