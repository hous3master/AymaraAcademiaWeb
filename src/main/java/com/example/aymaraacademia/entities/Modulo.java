package com.example.aymaraacademia.entities;

import javax.persistence.*;

@Entity
@Table(name="Modulo")
public class Modulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    @Column(name = "Nombre", nullable = false, length = 64)
    private String Nombre;
    @Column(name = "Descripcion", nullable = false)
    private String Descripcion;

    public Modulo(){
    }
    public Modulo(int ID, String nombre, String descripcion) {
        this.ID = ID;
        Nombre = nombre;
        Descripcion = descripcion;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
