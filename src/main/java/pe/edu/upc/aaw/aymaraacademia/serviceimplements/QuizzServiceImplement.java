package pe.edu.upc.aaw.aymaraacademia.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.aymaraacademia.entities.Quizz;
import pe.edu.upc.aaw.aymaraacademia.repositories.IQuizzRepository;
import pe.edu.upc.aaw.aymaraacademia.serviceinterfaces.IQuizzService;

import java.util.List;
@Service
public class QuizzServiceImplement implements IQuizzService {
    @Autowired
    private IQuizzRepository myRepository;

    // Add an item to table
    @Override
    public void insert(Quizz quizz) {
        myRepository.save(quizz);
    }

    // Delete an item by ID on table
    @Override
    public void delete(int idQuizz){
        myRepository.deleteById(idQuizz);
    }

    // Retrieve an items by ID from table
    @Override
    public Quizz listId(int idQuizz){
        return myRepository.findById(idQuizz).orElse(new Quizz());
    }

    // Retrieve all items from table
    @Override
    public List<Quizz> list() {
        return myRepository.findAll();
    }
}
