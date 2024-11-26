package com.example.api.annotations;

import java.lang.annotation.ElementType;

import com.example.api.validators.ValidateUser;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = ValidateUser.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)

public @interface UsernameConstraint {
    String message() default "Field must not be empty or null";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
