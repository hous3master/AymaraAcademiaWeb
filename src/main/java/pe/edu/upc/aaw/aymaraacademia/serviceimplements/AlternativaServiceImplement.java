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
    private IAlternativaRepository aR;

    @Override
    public void insert(Alternativa alternativa) {
        aR.save(alternativa);
    }

    @Override
    public List<Alternativa> list() {
        return aR.findAll();
    }

    @Override
    public void delete(int ID) {
        aR.deleteById(ID);
    }

    @Override
    public void update(Alternativa alternativa) {
        aR.save(alternativa);
    }

    @Override
    public Alternativa listID(int ID) {
        return aR.findById(ID).orElse(new Alternativa());
    }
}
