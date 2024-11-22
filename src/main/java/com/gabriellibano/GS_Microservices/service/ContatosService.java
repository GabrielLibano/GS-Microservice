package com.gabriellibano.GS_Microservices.service;

import java.util.List;
import java.util.Optional;

import com.gabriellibano.GS_Microservices.model.Contatos;
import com.gabriellibano.GS_Microservices.repository.ContatosRepository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ContatosService {

    private final ContatosRepository contatosRepository;

    public List<Contatos> list() {
        return contatosRepository.findAll();
    }

    public Contatos save(Contatos contatos) {
        return contatosRepository.save(contatos);
    }

    public boolean existsById(Long id) {
        return contatosRepository.existsById(id);
    }

    public void delete(Long id) {
        contatosRepository.deleteById(id);
    }

    public Optional<Contatos> findById(Long id) {
        return contatosRepository.findById(id);
    }

}
