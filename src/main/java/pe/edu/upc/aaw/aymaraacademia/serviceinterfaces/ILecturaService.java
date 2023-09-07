package pe.edu.upc.aaw.aymaraacademia.serviceinterfaces;

import pe.edu.upc.aaw.aymaraacademia.entities.Lectura;

import java.util.List;

public interface ILecturaService {
    void insert(Lectura lectura); // Add an item to table

    void delete(int idLectura); // Delete an item by ID on table

    Lectura listId(int idLectura); // Retrieve an items by ID from table
    List<Lectura> list(); // Retrieve all items from table
}
