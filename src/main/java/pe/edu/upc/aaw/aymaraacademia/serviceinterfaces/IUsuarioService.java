package pe.edu.upc.aaw.aymaraacademia.serviceinterfaces;

import pe.edu.upc.aaw.aymaraacademia.entities.Usuario;

import java.util.List;

public interface IUsuarioService {
    void insert(Usuario nombreTabla); // Add an item to table

    void delete(int idUsuario); // Delete an item by ID on table

    Usuario listId(int idUsuario); // Retrieve an items by ID from table
    List<Usuario> list(); // Retrieve all items from table
}