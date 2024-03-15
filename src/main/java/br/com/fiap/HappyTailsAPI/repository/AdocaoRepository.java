package br.com.fiap.HappyTailsAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.HappyTailsAPI.model.Adocao;

public interface AdocaoRepository  extends JpaRepository< Adocao, Long>{
    
}
