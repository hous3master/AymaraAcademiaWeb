package pe.edu.upc.aaw.aymaraacademia.serviceinterfaces;

import pe.edu.upc.aaw.aymaraacademia.entities.Pregunta;

import java.util.List;

public interface IPreguntaService {
    public void insert(Pregunta pregunta);
    List<Pregunta> list();
    public void delete(int ID);
    public void update(Pregunta pregunta);
    public Pregunta listID(int ID);
}
