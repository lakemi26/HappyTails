package br.com.fiap.HappyTailsAPI.model;

//import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.fiap.HappyTailsAPI.validation.TipoAdocao;
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

    @NotBlank(message = "{movimentacao.descricao.notblank}")
    @Size(min = 3, max = 255)
    
    private LocalDate dataAdocao;
    
    @Positive
    //private BigDecimal valor;
    private String genero;
    private String especie;

    @TipoAdocao
    private String tipo; //pet normal | pet especial


}
