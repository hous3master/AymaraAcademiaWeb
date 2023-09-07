package pe.edu.upc.aaw.aymaraacademia.serviceinterfaces;

import pe.edu.upc.aaw.aymaraacademia.entities.Unidad;

import java.util.List;

public interface IUnidadService {
    void insert(Unidad nombreTabla); // Add an item to table

    void delete(int idUnidad); // Delete an item by ID on table

    Unidad listId(int idUnidad); // Retrieve an items by ID from table
    List<Unidad> list(); // Retrieve all items from table
}