package pe.edu.upc.aaw.aymaraacademia.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.aymaraacademia.entities.Unidad;
import pe.edu.upc.aaw.aymaraacademia.repositories.IUnidadRepository;
import pe.edu.upc.aaw.aymaraacademia.serviceinterfaces.IUnidadService;

import java.util.List;
@Service
public class UnidadServiceImplement implements IUnidadService {
    @Autowired
    private IUnidadRepository myRepository;

    // Add an item to table
    @Override
    public void insert(Unidad unidad) {
        myRepository.save(unidad);
    }

    // Delete an item by ID on table
    @Override
    public void delete(int idUnidad){
        myRepository.deleteById(idUnidad);
    }

    // Retrieve an items by ID from table
    @Override
    public Unidad listId(int idUnidad){
        return myRepository.findById(idUnidad).orElse(new Unidad());
    }

    // Retrieve all items from table
    @Override
    public List<Unidad> list() {
        return myRepository.findAll();
    }
}
