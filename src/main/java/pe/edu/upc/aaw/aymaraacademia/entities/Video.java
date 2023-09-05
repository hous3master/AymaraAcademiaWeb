package pe.edu.upc.aaw.aymaraacademia.entities;

import jakarta.persistence.*;
import java.math.BigDecimal;
@Entity
@Table(name = "Video")
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    @Column(name = "Url", nullable = false)
    private String Url;
    @Column(name = "Titulo", nullable = false, length = 64)
    private String Titulo;
    @Column(name = "Descripcion", nullable = false)
    private String Descripcion;
    @Column (name = "Duracion", columnDefinition = "DECIMAL (10,2)")
    private BigDecimal Duracion;
    @Column(name = "Presentador", nullable = false, length = 64)
    private String Presentador;
    @Column(name = "Transcripcion", nullable = false)
    private String Transcripcion;
    @ManyToOne
    @JoinColumn(name = "Modulo_ID")
    private Modulo modulo;
    public Video(){}

    public Video(int ID, String url, String titulo, String descripcion, BigDecimal duracion, String presentador, String transcripcion, Modulo modulo) {
        this.ID = ID;
        Url = url;
        Titulo = titulo;
        Descripcion = descripcion;
        Duracion = duracion;
        Presentador = presentador;
        Transcripcion = transcripcion;
        this.modulo = modulo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
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

    public BigDecimal getDuracion() {
        return Duracion;
    }

    public void setDuracion(BigDecimal duracion) {
        Duracion = duracion;
    }

    public String getPresentador() {
        return Presentador;
    }

    public void setPresentador(String presentador) {
        Presentador = presentador;
    }

    public String getTranscripcion() {
        return Transcripcion;
    }

    public void setTranscripcion(String transcripcion) {
        Transcripcion = transcripcion;
    }

    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }
}
