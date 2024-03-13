package br.com.fiap.HappyTailsAPI.controller;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NOT_FOUND;
import static org.springframework.http.HttpStatus.NO_CONTENT;
import static org.springframework.http.HttpStatus.OK;


//import java.util.ArrayList;
import java.util.List;
//import java.util.Optional;

//import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.ResponseExtractor;
import org.springframework.web.server.ResponseStatusException;

import br.com.fiap.HappyTailsAPI.model.Tutor;
import br.com.fiap.HappyTailsAPI.repository.TutorRepository;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("tutor")
@Slf4j
public class TutorController {
    @Autowired // CDI -Injeção de Dependência
    TutorRepository repository;

    @GetMapping
    public List<Tutor>index(){
        return repository.findAll();
    }

    @PostMapping
    @ResponseStatus(CREATED)
    public Tutor create(@RequestBody Tutor tutor){
       log.info("cadastrando tutor: {}", tutor);
       return repository.save(tutor);
    }

    @GetMapping("{id}")
    public ResponseEntity<Tutor> get(@PathVariable Long id){
       log.info("buscando tutor com id{}",id);

        return repository
                    .findById(id)
                    .map(ResponseEntity::ok) //reference method
                    .orElse(ResponseEntity.notFound().build());
    }
        

    @DeleteMapping("{id}")
    @ResponseStatus(NO_CONTENT)
    public void destroy (@PathVariable Long id){
      log.info("apagando categoria {}",id);
      verificarSeExisteTutor(id);
       repository.deleteById(id);
    }

    @PutMapping("{id}")
    @ResponseStatus(OK)
    public Tutor update( @PathVariable Long id, @RequestBody Tutor tutor){

      verificarSeExisteTutor(id);

      tutor.setId(id);
      return repository.save(tutor);
    }
      
    private void verificarSeExisteTutor(Long id){
      repository
         .findById(id)
         .orElseThrow(() -> new ResponseStatusException(
                              NOT_FOUND,
                              "id do tutor não encontrado"
         ));
      }
}
