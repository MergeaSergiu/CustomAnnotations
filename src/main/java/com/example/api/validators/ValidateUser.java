package com.example.api.validators;


import com.example.api.annotations.UsernameConstraint;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidateUser implements ConstraintValidator<UsernameConstraint, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(value == null || value.isBlank()) {
            return false;
     }
        return true;
    }
}
