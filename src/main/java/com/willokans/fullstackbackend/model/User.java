package com.willokans.fullstackbackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "full_name", nullable = false)
    private String full_name;

    @Column(name = "email", nullable = false)
    private String email;
}
