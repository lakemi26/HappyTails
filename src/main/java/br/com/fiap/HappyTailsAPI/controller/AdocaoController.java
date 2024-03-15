package br.com.fiap.HappyTailsAPI.controller;

//import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.CREATED;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.server.ResponseStatusException;

import br.com.fiap.HappyTailsAPI.model.Adocao;
import br.com.fiap.HappyTailsAPI.repository.AdocaoRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("adocao")
public class AdocaoController {

    @Autowired
    AdocaoRepository repository;

    @PostMapping
    @ResponseStatus(CREATED)
    public Adocao create(@RequestBody @Valid Adocao adocao){       
        return repository.save(adocao);        
    }
   
}
