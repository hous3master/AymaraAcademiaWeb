package pe.edu.upc.aaw.aymaraacademia.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.aymaraacademia.entities.Alternativa;
import pe.edu.upc.aaw.aymaraacademia.repositories.IAlternativaRepository;
import pe.edu.upc.aaw.aymaraacademia.serviceinterfaces.IAlternativaService;

import java.util.List;

@Service
public class AlternativaServiceImplement implements IAlternativaService {
    @Autowired
    private IAlternativaRepository myRepository;

    // Add an item to table
    @Override
    public void insert(Alternativa alternativa) {
        myRepository.save(alternativa);
    }

    // Delete an item by ID on table
    @Override
    public void delete(int idAlternativa){
        myRepository.deleteById(idAlternativa);
    }

    // Retrieve an items by ID from table
    @Override
    public Alternativa listId(int idAlternativa){
        return myRepository.findById(idAlternativa).orElse(new Alternativa());
    }

    // Retrieve all items from table
    @Override
    public List<Alternativa> list() {
        return myRepository.findAll();
    }
}
