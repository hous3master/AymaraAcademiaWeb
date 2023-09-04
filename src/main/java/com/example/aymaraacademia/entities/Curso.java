package com.example.aymaraacademia.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Curso")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    @Column(name = "Nombre", nullable = false, length = 64)
    private String Nombre;
    @Column(name = "Descripcion", nullable = false)
    private String Descripcion;
    @Column(name = "Duracion", nullable = false, length = 64)
    private int Duracion;
    @OneToMany (mappedBy = "curso")
    Set<UsuarioCurso> usuarios;

    public Curso() {
    }

    public Curso(int ID, String nombre, String descripcion, int duracion, Set<UsuarioCurso> usuarios) {
        this.ID = ID;
        Nombre = nombre;
        Descripcion = descripcion;
        Duracion = duracion;
        this.usuarios = usuarios;
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

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int duracion) {
        Duracion = duracion;
    }

    public Set<UsuarioCurso> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Set<UsuarioCurso> usuarios) {
        this.usuarios = usuarios;
    }
}
