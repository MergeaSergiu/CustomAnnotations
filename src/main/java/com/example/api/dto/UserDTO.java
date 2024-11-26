package com.example.api.dto;


import com.example.api.annotations.PasswordVerification;
import com.example.api.annotations.UsernameConstraint;
import com.example.api.annotations.UsernameExistence;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDTO {

    @UsernameConstraint(message = "Username is empty or null")
    @UsernameExistence(message = "This username is already taken")
    String username;

    @PasswordVerification(message = "Password does not respect the criteria")
    String password;
}
