package pe.edu.upc.aaw.aymaraacademia.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Proyecto")
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProyecto;

    @Column(name = "titulo", length = 64, nullable = false)
    private String titulo;

    @Column(name = "descripcion", length = 255, nullable = false)
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "idUnidad")
    private Unidad unidad;
}