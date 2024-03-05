package br.com.fiap.HappyTailsAPI.models;

import java.util.Random;

public record Tutor(Long id, String nomeCompleto, String cpf) {
   public Tutor(Long id, String nomeCompleto, String cpf){
    var key = (id != null) ? id : Math.abs(new Random().nextLong());
    this.id = key;
    this.nomeCompleto = nomeCompleto;
    this.cpf = cpf;
   } 
}
