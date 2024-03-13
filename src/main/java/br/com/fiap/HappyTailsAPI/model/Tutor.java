package br.com.fiap.HappyTailsAPI.model;

//import jakarta.annotation.Generated;

//import java.util.Random;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Tutor{
   @Id @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   private String nomeCompleto;
   private String cpf;
}
