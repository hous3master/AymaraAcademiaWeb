package pe.edu.upc.aaw.aymaraacademia.serviceinterfaces;

import pe.edu.upc.aaw.aymaraacademia.entities.Quizz;

import java.util.List;

public interface IQuizzService {
    public void insert(Quizz quizz);
    List<Quizz> list();
    public void delete(int ID);
    public void update(Quizz quizz);

    public Quizz listID(int ID);
}
