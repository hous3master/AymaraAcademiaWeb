package pe.edu.upc.aaw.aymaraacademia.serviceinterfaces;

import pe.edu.upc.aaw.aymaraacademia.entities.Quizz;

import java.util.List;

public interface IQuizzService {
    void insert(Quizz nombreTabla); // Add an item to table

    void delete(int idQuizz); // Delete an item by ID on table

    Quizz listId(int idQuizz); // Retrieve an items by ID from table
    List<Quizz> list(); // Retrieve all items from table
}
