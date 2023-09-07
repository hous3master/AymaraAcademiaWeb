package pe.edu.upc.aaw.aymaraacademia.serviceinterfaces;

import pe.edu.upc.aaw.aymaraacademia.entities.Pregunta;

import java.util.List;

public interface IPreguntaService {
    void insert(Pregunta pregunta); // Add an item to table

    void delete(int idPregunta); // Delete an item by ID on table

    Pregunta listId(int idPregunta); // Retrieve an items by ID from table
    List<Pregunta> list(); // Retrieve all items from table
}
