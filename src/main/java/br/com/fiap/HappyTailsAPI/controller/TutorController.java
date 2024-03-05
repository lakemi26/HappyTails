package br.com.fiap.HappyTailsAPI.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.fiap.HappyTailsAPI.models.Tutor;

@Controller
public class TutorController {

    Logger log = LoggerFactory.getLogger(getClass());

    List<Tutor> repository = new ArrayList<>();

    @RequestMapping(method = RequestMethod.GET, path = "/tutor")
    @ResponseBody
    public List<Tutor>index(){
        return repository;
    }

    @RequestMapping(method = RequestMethod.POST, path ="/tutor")
    @ResponseBody
    public ResponseEntity<Tutor> create(@RequestBody Tutor tutor){
        log.info("cadastrando tutor: {}", tutor);
        repository.add(tutor);
        return ResponseEntity.status(201).body(tutor);
    }

    @RequestMapping(method = RequestMethod.GET , path ="/tutor/{id}")
    @ResponseBody
    public ResponseEntity<Tutor> get(@PathVariable Long id){
        log.info("buscando tutor com id{}",id);

        var tutor = repository
                        .stream()
                        .filter(c -> c.id().equals(id))
                        .findFirst();

       if(tutor.isEmpty()){
        return ResponseEntity.status(404).build();
       }                 

       return ResponseEntity.status(200).body(tutor.get());
    }
    
}
