package br.com.fiap.HappyTailsAPI.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;;

@Target(FIELD)
@Retention(RUNTIME)
@Constraint(validatedBy = TipoAdocaoValidator.class)
public @interface TipoAdocao {

    String message() default "{adocao.tipo.invalido}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
    
}
