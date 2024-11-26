package com.example.api.validators;

import com.example.api.annotations.UsernameExistence;
import com.example.api.entity.User;
import com.example.api.repository.UserRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ExistenceUser implements ConstraintValidator<UsernameExistence, String> {

    private final UserRepository userRepository;

    public ExistenceUser(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        User user = userRepository.findByUsername(value);
        return user == null;
    }
}
