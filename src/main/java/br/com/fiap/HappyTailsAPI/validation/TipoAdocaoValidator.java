package br.com.fiap.HappyTailsAPI.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class TipoAdocaoValidator implements ConstraintValidator<TipoAdocao, String> {
    
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value.equals("PET_NORMAL") || value.equals("PET_ESPECIAL");
    }
}
    
