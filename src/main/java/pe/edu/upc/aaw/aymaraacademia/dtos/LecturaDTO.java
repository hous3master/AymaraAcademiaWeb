package pe.edu.upc.aaw.aymaraacademia.dtos;

import pe.edu.upc.aaw.aymaraacademia.entities.Modulo;

public class LecturaDTO {
    private int idLectura;
    private String descripcion;
    private String titulo;
    private String autor;
    private Modulo modulo;

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
