package ru.stupakov.accountservice.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "identifier")
@Data
public class Identifier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Lob
    @Column(name = "name")
    private String name;

    @Lob
    @Column(name = "surname")
    private String surname;

    @OneToMany(mappedBy = "identifier")
    private Set<Balance> balances = new LinkedHashSet<>();
}