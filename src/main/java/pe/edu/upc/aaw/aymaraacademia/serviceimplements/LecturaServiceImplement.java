package pe.edu.upc.aaw.aymaraacademia.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.aymaraacademia.entities.Lectura;
import pe.edu.upc.aaw.aymaraacademia.repositories.ILecturaRepository;
import pe.edu.upc.aaw.aymaraacademia.serviceinterfaces.ILecturaService;

import java.util.List;
@Service
public class LecturaServiceImplement implements ILecturaService {
    @Autowired
    private ILecturaRepository myRepository;

    // Add an item to table
    @Override
    public void insert(Lectura lectura) {
        myRepository.save(lectura);
    }

    // Delete an item by ID on table
    @Override
    public void delete(int idLectura){
        myRepository.deleteById(idLectura);
    }

    // Retrieve an items by ID from table
    @Override
    public Lectura listId(int idLectura){
        return myRepository.findById(idLectura).orElse(new Lectura());
    }

    // Retrieve all items from table
    @Override
    public List<Lectura> list() {
        return myRepository.findAll();
    }
}
