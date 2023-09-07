package pe.edu.upc.aaw.aymaraacademia.dtos;

import pe.edu.upc.aaw.aymaraacademia.entities.Modulo;

public class VideoDTO {
    private int idVideo;
    private String url;
    private String titulo;
    private String descripcion;
    private Double duracion;
    private String presentador;
    private String transcripcion;
    private Modulo modulo;

    public int getIdVideo() {
        return idVideo;
    }

    public void setIdVideo(int idVideo) {
        this.idVideo = idVideo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    public String getPresentador() {
        return presentador;
    }

    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }

    public String getTranscripcion() {
        return transcripcion;
    }

    public void setTranscripcion(String transcripcion) {
        this.transcripcion = transcripcion;
    }

    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }
}
