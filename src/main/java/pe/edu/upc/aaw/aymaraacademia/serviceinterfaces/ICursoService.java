package pe.edu.upc.aaw.aymaraacademia.serviceinterfaces;

import pe.edu.upc.aaw.aymaraacademia.entities.Curso;

import java.util.List;

public interface ICursoService {
    void insert(Curso curso); // Add an item to table

    void delete(int idCurso); // Delete an item by ID on table

    Curso listId(int idCurso); // Retrieve an items by ID from table
    List<Curso> list(); // Retrieve all items from table
}
