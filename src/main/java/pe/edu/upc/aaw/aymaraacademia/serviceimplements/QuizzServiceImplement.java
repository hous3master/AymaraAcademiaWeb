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
    private IQuizzRepository qR;
    @Override
    public void insert(Quizz quizz) {
        qR.save(quizz);
    }

    @Override
    public List<Quizz> list() {

        return qR.findAll();
    }

    @Override
    public void delete(int ID) {
        qR.deleteById(ID);
    }

    @Override
    public void update(Quizz quizz) {
        qR.save(quizz);
    }

    @Override
    public Quizz listID(int ID) {

        return qR.findById(ID).orElse(new Quizz());
    }
}
