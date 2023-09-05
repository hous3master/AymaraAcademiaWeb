package pe.edu.upc.aaw.aymaraacademia.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;

    @Column(name = "nombre", length = 64, nullable = false)
    private String nombre;
    @Column(name = "descripcion", length = 255, nullable = false)
    private String descripcion;
    @ManyToOne
    @JoinColumn(name = "idCurso")
    private Curso curso;
}
