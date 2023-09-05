package pe.edu.upc.aaw.aymaraacademia.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.aymaraacademia.entities.Curso;
import pe.edu.upc.aaw.aymaraacademia.repositories.ICursoRepository;
import pe.edu.upc.aaw.aymaraacademia.serviceinterfaces.ICursoService;

import java.util.List;
@Service
public class CursoServiceImplement implements ICursoService {
    @Autowired
    private ICursoRepository myRepository;

    // Add an item to table
    @Override
    public void insert(Curso curso) {
        myRepository.save(curso);
    }

    // Delete an item by ID on table
    @Override
    public void delete(int idCurso){
        myRepository.deleteById(idCurso);
    }

    // Retrieve an items by ID from table
    @Override
    public Curso listId(int idCurso){
        return myRepository.findById(idCurso).orElse(new Curso());
    }

    // Retrieve all items from table
    @Override
    public List<Curso> list() {
        return myRepository.findAll();
    }
}