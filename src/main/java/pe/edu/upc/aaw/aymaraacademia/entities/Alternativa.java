package pe.edu.upc.aaw.aymaraacademia.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Alternativa")
public class Alternativa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAlternativa;

    @Column(name = "respuesta", length = 255, nullable = false)
    private String respuesta;

    @Column(name = "correcta", nullable = false)
    private Boolean correcta;
    public Alternativa() {
    }

    public Alternativa(int idAlternativa, String respuesta, Boolean correcta) {
        this.idAlternativa = idAlternativa;
        this.respuesta = respuesta;
        this.correcta = correcta;
    }

    public int getIdAlternativa() {
        return idAlternativa;
    }

    public void setIdAlternativa(int idAlternativa) {
        this.idAlternativa = idAlternativa;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public Boolean getCorrecta() {
        return correcta;
    }

    public void setCorrecta(Boolean correcta) {
        this.correcta = correcta;
    }
}

