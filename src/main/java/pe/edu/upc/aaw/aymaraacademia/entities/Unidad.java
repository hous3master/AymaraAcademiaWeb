package pe.edu.upc.aaw.aymaraacademia.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Unidad")
public class Unidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    @Column(name = "Nombre", nullable = false, length = 64)
    private String Nombre;
    @Column(name = "Descripcion", nullable = false)
    private String Descripcion;
    @ManyToOne
    @JoinColumn(name = "Curso_ID")
    private Curso curso;
    public Unidad(){}

    public Unidad(int ID, String nombre, String descripcion, Curso curso) {
        this.ID = ID;
        Nombre = nombre;
        Descripcion = descripcion;
        this.curso = curso;
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

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
