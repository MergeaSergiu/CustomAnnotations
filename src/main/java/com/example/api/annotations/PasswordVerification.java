package com.example.api.annotations;


import com.example.api.validators.ValidatePassword;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = ValidatePassword.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface PasswordVerification {

    String message() default "Field must not be empty or null";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
