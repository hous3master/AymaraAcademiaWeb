package pe.edu.upc.aaw.aymaraacademia.entities;

import jakarta.persistence.*;
@Entity
@Table(name = "Lectura")
public class Lectura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLectura;

    @Column(name = "descripcion", length = 255, nullable = false)
    private String descripcion;

    @Column(name = "titulo", length = 64, nullable = false)
    private String titulo;

    @Column(name = "autor", length = 64, nullable = false)
    private String autor;

    @ManyToOne
    @JoinColumn(name = "idModulo")
    private Modulo modulo;

    public Lectura() {
    }

    public Lectura(int idLectura, String descripcion, String titulo, String autor, Modulo modulo) {
        this.idLectura = idLectura;
        this.descripcion = descripcion;
        this.titulo = titulo;
        this.autor = autor;
        this.modulo = modulo;
    }

    public int getIdLectura() {
        return idLectura;
    }

    public void setIdLectura(int idLectura) {
        this.idLectura = idLectura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }
}
