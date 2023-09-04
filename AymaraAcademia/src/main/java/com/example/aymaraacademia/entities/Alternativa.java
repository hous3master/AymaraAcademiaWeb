package com.example.aymaraacademia.entities;

import javax.persistence.*;
import java.math.BigDecimal;
@Entity
@Table(name = "Alternativa")
public class Alternativa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    @Column(name = "Respuesta", nullable = false)
    private String Respuesta;
    @Column(name = "Correcta", columnDefinition = "boolean", nullable = false)
    private boolean Correcta;
    public Alternativa(){}
}
