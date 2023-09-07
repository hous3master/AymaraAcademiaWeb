package pe.edu.upc.aaw.aymaraacademia.entities;

import javax.persistence.*;


@Entity
@Table(name = "Modulo")
public class Modulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idModulo;

    @Column(name = "nombre", length = 64, nullable = false)
    private String nombre;

    @Column(name = "descripcion", length = 255, nullable = false)
    private String descripcion;

    public Modulo() {
    }

    public Modulo(int idModulo, String nombre, String descripcion) {
        this.idModulo = idModulo;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(int idModulo) {
        this.idModulo = idModulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}