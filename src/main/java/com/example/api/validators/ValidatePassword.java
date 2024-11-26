package com.example.api.validators;

import com.example.api.annotations.PasswordVerification;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;


public class ValidatePassword implements ConstraintValidator<PasswordVerification, String> {

    private static final String PASSWORD_PATTERN =
            "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$";

    @Override
    public boolean isValid(String password, ConstraintValidatorContext context) {
        if(password == null || password.length() < 8 || password.isBlank()){
            return false;
        }
        return password.matches(PASSWORD_PATTERN);
    }
}
