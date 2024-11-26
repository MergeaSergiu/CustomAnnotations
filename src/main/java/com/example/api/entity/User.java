package com.example.api.entity;


import jakarta.persistence.*;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Data
@Entity
@Table(name = "_usercustom")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;

    private String username;

    private String password;

}
