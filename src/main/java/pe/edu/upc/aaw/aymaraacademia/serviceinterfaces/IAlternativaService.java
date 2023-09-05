package pe.edu.upc.aaw.aymaraacademia.serviceinterfaces;

import pe.edu.upc.aaw.aymaraacademia.entities.Alternativa;

import java.util.List;

public interface IAlternativaService {
    void insert(Alternativa alternativa); // Add an item to table

    void delete(int idAlternativa); // Delete an item by ID on table

    Alternativa listId(int idAlternativa); // Retrieve an items by ID from table
    List<Alternativa> list(); // Retrieve all items from table
}
