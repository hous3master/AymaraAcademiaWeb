package pe.edu.upc.aaw.aymaraacademia.dtos;

import pe.edu.upc.aaw.aymaraacademia.entities.Quizz;

public class PreguntaDTO {
    private int idPregunta;
    private String pregunta;
    private Quizz quizz;

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public Quizz getQuizz() {
        return quizz;
    }

    public void setQuizz(Quizz quizz) {
        this.quizz = quizz;
    }
}
