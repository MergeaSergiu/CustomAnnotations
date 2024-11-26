package com.example.api.annotations;

import com.example.api.validators.ExistenceUser;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = ExistenceUser.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)

public @interface UsernameExistence {
    String message() default "Username already exists";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}