package br.com.fiap.HappyTailsAPI.controller;

//import java.util.ArrayList;
import java.util.List;
//import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.HappyTailsAPI.model.Tutor;
import br.com.fiap.HappyTailsAPI.repository.TutorRepository;

@RestController
@RequestMapping("tutor")
public class TutorController {

    Logger log = LoggerFactory.getLogger(getClass());

    //List<Tutor> repository = new ArrayList<>();

    @Autowired
    TutorRepository repository;

    @GetMapping
    public List<Tutor>index(){
        return repository.findAll();
    }

    //@PostMapping
    //public ResponseEntity<Tutor> create(@RequestBody Tutor tutor){
    //    log.info("cadastrando tutor: {}", tutor);
    //    repository.add(tutor);
    //    return ResponseEntity.status(201).body(tutor);
    //}

    //@GetMapping("{id}")
    //public ResponseEntity<Tutor> get(@PathVariable Long id){
    //    log.info("buscando tutor com id{}",id);

    //    var tutor = getTutorById(id);

    //    if(tutor.isEmpty()){
    //        return ResponseEntity.notFound().build();
    //    }

    //    return ResponseEntity.ok(Tutor.get());

    //}
    //private Optional<Tutor> getTutorById(Long id){
    //    var tutor = repository
    //                    .stream()
    //                    .filter(c -> c.id().equals(id))
    //                    .findFirst();
    //    return tutor;

    //}

    //@DeleteMapping("{id}")
    //public ResponseEntity< Object> destroy(@PathVariable Long id){
    //    long.info("apagando categoria {}",id);

    //    var tutor = getTutorById();

    //    if (tutor,isEmpty()){
    //        return ResponseEntity.notFound().build();
    //    }

    //    repository.remove(tutor.get());
    //    return ResponseEntity.noContent().build();

    //}

    //@PutMapping("{id}")
    //public ResponseEntity<Tutor> update(
    //    @PathVariable Long id,
    //    @RequestBody Tutor tutor
    //){
    //    log.info("atualizando categoria com id {} para {}",id tutor);

    //    var TutorEncontrado = getTutorById(id);

    //    if (TutorEncontrado.isEmpty()){
    //        return ResponseEntity.notFound().build();
    //    }

    //    var tutorAtualizado = new Tutor(id, tutor.nome(), tutor.cpf());
    //    repository.remove(TutorEncontrado.get());
    //    repository.add(tutorAtualizado);

    //    return ResponseEntity.ok(tutorAtualizado);
    //}
    
}
