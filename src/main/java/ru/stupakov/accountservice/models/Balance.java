package ru.stupakov.accountservice.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "balance")
@Data
public class Balance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "identifier_id")
    private Identifier identifier;

    @Column(name = "value")
    private Integer value;

}