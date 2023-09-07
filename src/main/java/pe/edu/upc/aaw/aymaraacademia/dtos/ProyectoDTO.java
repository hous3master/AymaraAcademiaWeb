package pe.edu.upc.aaw.aymaraacademia.dtos;

import pe.edu.upc.aaw.aymaraacademia.entities.Unidad;

public class ProyectoDTO {
    private int idProyecto;
    private String titulo;
    private String descripcion;
    private Unidad unidad;

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Unidad getUnidad() {
        return unidad;
    }

    public void setUnidad(Unidad unidad) {
        this.unidad = unidad;
    }
}
