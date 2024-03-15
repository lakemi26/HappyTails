package br.com.fiap.HappyTailsAPI.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
public class Adocao {

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Positive
    private long id;

    @NotBlank
    @Size(min = 3, max = 255)
    
    private LocalDate dataAdocao;
    
    @Positive
    private BigDecimal valor;
    private String infoPet; //gênero | espécie

    
}
