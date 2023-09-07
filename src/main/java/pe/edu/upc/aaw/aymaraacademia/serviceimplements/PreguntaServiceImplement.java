package pe.edu.upc.aaw.aymaraacademia.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.aymaraacademia.entities.Pregunta;
import pe.edu.upc.aaw.aymaraacademia.repositories.IPreguntaRepository;
import pe.edu.upc.aaw.aymaraacademia.serviceinterfaces.IPreguntaService;

import java.util.List;
@Service
public class PreguntaServiceImplement implements IPreguntaService {
    @Autowired
    private IPreguntaRepository myRepository;

    // Add an item to table
    @Override
    public void insert(Pregunta modulo) {
        myRepository.save(modulo);
    }

    // Delete an item by ID on table
    @Override
    public void delete(int idPregunta){
        myRepository.deleteById(idPregunta);
    }

    // Retrieve an items by ID from table
    @Override
    public Pregunta listId(int idPregunta){
        return myRepository.findById(idPregunta).orElse(new Pregunta());
    }

    // Retrieve all items from table
    @Override
    public List<Pregunta> list() {
        return myRepository.findAll();
    }
}
