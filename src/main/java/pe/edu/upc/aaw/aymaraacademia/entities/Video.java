package pe.edu.upc.aaw.aymaraacademia.entities;

import javax.persistence.*;
import java.math.BigDecimal;
@Entity
@Table(name = "Video")
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVideo;

    @Column(name = "url", length = 50, nullable = false)
    private String nombreColumna;
    @Column(name = "titulo", length = 50, nullable = false)
    private String titulo;
    @Column(name = "descripcion", length = 50, nullable = false)
    private String descripcion;
    @Column(name = "presentador", length = 50, nullable = false)
    private String presentador;
    @Column(name = "transcripcion", length = 50, nullable = false)
    private String transcripcion;
    @Column(name = "duracion", nullable = false)
    private Double duracion;
    @ManyToOne
    @JoinColumn(name = "idModulo")
    private Modulo modulo;
}