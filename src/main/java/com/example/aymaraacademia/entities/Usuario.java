package com.example.aymaraacademia.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    @Column(name = "Nombre", nullable = false, length = 64)
    private String Nombre;
    @Column(name = "Apellido", nullable = false, length = 64)
    private String Apellido;
    @Column(name = "Edad", nullable = false)
    private int Edad;
    @Column(name = "Resena", nullable = false)
    private int Resena;
    @Column(name = "Tipo_Usuario", nullable = false, length = 64)
    private String Tipo_Usuario;
    @Column(name = "Contrasena", nullable = false, length = 64)
    private String Contrasena;
    @Column(name = "Email", nullable = false, length = 64)
    private String Email;
    @OneToMany(mappedBy = "usuario")
    Set<UsuarioCurso> cursos;
    @OneToMany(mappedBy = "usuario")
    Set<Calificacion> calificaciones;

    public Usuario() {
    }

    public Usuario(int ID, String nombre, String apellido, int edad, int resena, String tipo_Usuario, String contrasena, String email, Set<UsuarioCurso> cursos, Set<Calificacion> calificaciones) {
        this.ID = ID;
        Nombre = nombre;
        Apellido = apellido;
        Edad = edad;
        Resena = resena;
        Tipo_Usuario = tipo_Usuario;
        Contrasena = contrasena;
        Email = email;
        this.cursos = cursos;
        this.calificaciones = calificaciones;
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

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public int getResena() {
        return Resena;
    }

    public void setResena(int resena) {
        Resena = resena;
    }

    public String getTipo_Usuario() {
        return Tipo_Usuario;
    }

    public void setTipo_Usuario(String tipo_Usuario) {
        Tipo_Usuario = tipo_Usuario;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String contrasena) {
        Contrasena = contrasena;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Set<UsuarioCurso> getCursos() {
        return cursos;
    }

    public void setCursos(Set<UsuarioCurso> cursos) {
        this.cursos = cursos;
    }

    public Set<Calificacion> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(Set<Calificacion> calificaciones) {
        this.calificaciones = calificaciones;
    }
}

// Test comentario
