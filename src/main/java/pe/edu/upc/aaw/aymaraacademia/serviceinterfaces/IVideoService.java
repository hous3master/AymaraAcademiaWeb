package pe.edu.upc.aaw.aymaraacademia.serviceinterfaces;

import pe.edu.upc.aaw.aymaraacademia.entities.Video;
import pe.edu.upc.aaw.aymaraacademia.entities.Video;

import java.util.List;

public interface IVideoService {
    void insert(Video video); // Add an item to table

    void delete(int idVideo); // Delete an item by ID on table

    Video listId(int idVideo); // Retrieve an items by ID from table
    List<Video> list(); // Retrieve all items from table
}