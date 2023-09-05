package pe.edu.upc.aaw.aymaraacademia.entities;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Proyecto")
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    @Column(name = "Titulo", nullable = false, length = 64)
    private String Titulo;
    @Column(name = "Descripcion", nullable = false)
    private String Descripcion;
    @ManyToOne
    @JoinColumn(name = "Unidad_ID")
    private Unidad unidad;
    @OneToMany (mappedBy = "proyecto")
    Set<Calificacion> usuarios;

    public Proyecto() {
    }

    public Proyecto(int ID, String titulo, String descripcion, Unidad unidad, Set<Calificacion> usuarios) {
        this.ID = ID;
        Titulo = titulo;
        Descripcion = descripcion;
        this.unidad = unidad;
        this.usuarios = usuarios;
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

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public Unidad getUnidad() {
        return unidad;
    }

    public void setUnidad(Unidad unidad) {
        this.unidad = unidad;
    }

    public Set<Calificacion> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Set<Calificacion> usuarios) {
        this.usuarios = usuarios;
    }
}
