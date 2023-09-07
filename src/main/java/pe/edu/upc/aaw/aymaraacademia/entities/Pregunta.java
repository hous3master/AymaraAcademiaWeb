package pe.edu.upc.aaw.aymaraacademia.entities;

import javax.persistence.*;


@Entity
@Table(name = "Pregunta")
public class Pregunta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPregunta;

    @Column(name = "descripcion", length = 255, nullable = false)
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "idQuizz")
    private Quizz quizz;

    public Pregunta() {
    }

    public Pregunta(int idPregunta, String descripcion, Quizz quizz) {
        this.idPregunta = idPregunta;
        this.descripcion = descripcion;
        this.quizz = quizz;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Quizz getQuizz() {
        return quizz;
    }

    public void setQuizz(Quizz quizz) {
        this.quizz = quizz;
    }
}