package pe.edu.upc.aaw.aymaraacademia.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.aymaraacademia.entities.Modulo;
import pe.edu.upc.aaw.aymaraacademia.repositories.IModuloRepository;
import pe.edu.upc.aaw.aymaraacademia.serviceinterfaces.IModuloService;

import java.util.List;
@Service
public class ModuloServiceImplement implements IModuloService {
    @Autowired
    private IModuloRepository myRepository;

    // Add an item to table
    @Override
    public void insert(Modulo modulo) {
        myRepository.save(modulo);
    }

    // Delete an item by ID on table
    @Override
    public void delete(int idModulo){
        myRepository.deleteById(idModulo);
    }

    // Retrieve an items by ID from table
    @Override
    public Modulo listId(int idModulo){
        return myRepository.findById(idModulo).orElse(new Modulo());
    }

    // Retrieve all items from table
    @Override
    public List<Modulo> list() {
        return myRepository.findAll();
    }
}
