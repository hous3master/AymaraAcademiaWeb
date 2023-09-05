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
    private ILecturaRepository lR;

    @Override
    public void insert(Lectura lectura) {
        lR.save(lectura);
    }

    @Override
    public List<Lectura> list() {
        return lR.findAll();
    }

    @Override
    public void delete(int ID) {
        lR.deleteById(ID);
    }

    @Override
    public void update(Lectura lectura) {
        lR.save(lectura);
    }

    @Override
    public Lectura listID(int ID) {
        return lR.findById(ID).orElse(new Lectura());
    }
}
