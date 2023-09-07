package pe.edu.upc.aaw.aymaraacademia.serviceinterfaces;

import pe.edu.upc.aaw.aymaraacademia.entities.Proyecto;

import java.util.List;

public interface IProyectoService {
    void insert(Proyecto proyecto); // Add an item to table

    void delete(int idProyecto); // Delete an item by ID on table

    Proyecto listId(int idProyecto); // Retrieve an items by ID from table
    List<Proyecto> list(); // Retrieve all items from table
}