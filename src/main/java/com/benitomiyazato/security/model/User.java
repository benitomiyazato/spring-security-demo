package com.benitomiyazato.security.model;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "user_table")
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    private String firstName;

    private String lastName;

    private String email;

    private String password;
}
