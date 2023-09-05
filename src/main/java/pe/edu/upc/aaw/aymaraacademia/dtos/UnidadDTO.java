package pe.edu.upc.aaw.aymaraacademia.dtos;

import pe.edu.upc.aaw.aymaraacademia.entities.Curso;

public class UnidadDTO {
    private int idUnidad;
    private String nombre;
    private String descripcion;
    private Curso curso;

    public int getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(int idUnidad) {
        this.idUnidad = idUnidad;
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

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
