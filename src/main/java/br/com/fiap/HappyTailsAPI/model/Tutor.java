package br.com.fiap.HappyTailsAPI.model;

//import java.util.Random;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Tutor{
   @Id
   private Long id;
   private String nomeCompleto;
   private String cpf;
}
