package com.example.aymaraacademia.entities;

import javax.persistence.*;

@Entity
@Table(name = "Quizz")
public class Quizz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    @Column(name = "Titulo", nullable = false)
    private String Titulo;
    @ManyToOne
    @JoinColumn(name = "Modulo_ID")
    private Modulo modulo;
    public Quizz(){}

    public Quizz(int ID, String titulo, Modulo modulo) {
        this.ID = ID;
        Titulo = titulo;
        this.modulo = modulo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }
}
