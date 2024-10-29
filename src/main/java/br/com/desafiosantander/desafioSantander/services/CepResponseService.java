package br.com.desafiosantander.desafioSantander.services;

import br.com.desafiosantander.desafioSantander.dto.CepResponseDTO;
import br.com.desafiosantander.desafioSantander.entities.CepResponse;
import br.com.desafiosantander.desafioSantander.repositories.CepResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

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
}
