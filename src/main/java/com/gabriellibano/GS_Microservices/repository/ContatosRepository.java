package com.gabriellibano.GS_Microservices.repository;

import com.gabriellibano.GS_Microservices.model.Contatos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ContatosRepository extends JpaRepository<Contatos, Long>{
    <T> T findByNome(String nome);
}