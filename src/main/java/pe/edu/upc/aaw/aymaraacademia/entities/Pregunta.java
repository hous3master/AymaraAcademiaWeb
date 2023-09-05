package pe.edu.upc.aaw.aymaraacademia.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "Pregunta")
public class Pregunta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    @Column(name = "Pregunta", nullable = false)
    private String Pregunta;
    @ManyToOne
    @JoinColumn(name = "Quizzes_ID")
    private Quizz quizz;
    public Pregunta(){
    }

    public Pregunta(int ID, String pregunta, Quizz quizz) {
        this.ID = ID;
        Pregunta = pregunta;
        this.quizz = quizz;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPregunta() {
        return Pregunta;
    }

    public void setPregunta(String pregunta) {
        Pregunta = pregunta;
    }

    public Quizz getQuizz() {
        return quizz;
    }

    public void setQuizz(Quizz quizz) {
        this.quizz = quizz;
    }
}
