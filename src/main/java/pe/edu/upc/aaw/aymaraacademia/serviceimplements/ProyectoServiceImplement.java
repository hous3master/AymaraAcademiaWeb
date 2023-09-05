package pe.edu.upc.aaw.aymaraacademia.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.aymaraacademia.entities.Proyecto;
import pe.edu.upc.aaw.aymaraacademia.repositories.IProyectoRepository;
import pe.edu.upc.aaw.aymaraacademia.serviceinterfaces.IProyectoService;

import java.util.List;
@Service
public class ProyectoServiceImplement implements IProyectoService {
    @Autowired
    private IProyectoRepository myRepository;

    // Add an item to table
    @Override
    public void insert(Proyecto proyecto) {
        myRepository.save(proyecto);
    }

    // Delete an item by ID on table
    @Override
    public void delete(int idProyecto){
        myRepository.deleteById(idProyecto);
    }

    // Retrieve an items by ID from table
    @Override
    public Proyecto listId(int idProyecto){
        return myRepository.findById(idProyecto).orElse(new Proyecto());
    }

    // Retrieve all items from table
    @Override
    public List<Proyecto> list() {
        return myRepository.findAll();
    }
}
