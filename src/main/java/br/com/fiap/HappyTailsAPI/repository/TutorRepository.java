package br.com.fiap.HappyTailsAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.HappyTailsAPI.model.Tutor;

public interface TutorRepository extends JpaRepository<Tutor, Long>{

    
}
