package pe.edu.upc.aaw.aymaraacademia.serviceinterfaces;

import pe.edu.upc.aaw.aymaraacademia.entities.Modulo;

import java.util.List;

public interface IModuloService {
    void insert(Modulo modulo); // Add an item to table

    void delete(int idModulo); // Delete an item by ID on table

    Modulo listId(int idModulo); // Retrieve an items by ID from table
    List<Modulo> list(); // Retrieve all items from table
}
