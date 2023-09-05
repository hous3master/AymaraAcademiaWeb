package pe.edu.upc.aaw.aymaraacademia.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "Lectura")
public class Lectura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    @Column(name = "Descripcion", nullable = false)
    private String Descripcion;
    @Column(name = "Titulo", nullable = false, length = 64)
    private String Titulo;
    @Column(name = "Autor", nullable = false, length = 64)
    private String Autor;
    @ManyToOne
    @JoinColumn(name = "Modulo_ID")
    private Modulo modulo;
    public Lectura(){}

    public Lectura(int ID, String descripcion, String titulo, String autor, Modulo modulo) {
        this.ID = ID;
        Descripcion = descripcion;
        Titulo = titulo;
        Autor = autor;
        this.modulo = modulo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }
}
