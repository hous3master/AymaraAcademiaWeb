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
    private IPreguntaRepository pR;
    @Override
    public void insert(Pregunta pregunta) {
        pR.save(pregunta);
    }

    @Override
    public List<Pregunta> list() {

        return pR.findAll();
    }

    @Override
    public void delete(int ID) {
        pR.deleteById(ID);
    }

    @Override
    public void update(Pregunta pregunta) {
        pR.save(pregunta);
    }

    @Override
    public Pregunta listID(int ID) {
        return pR.findById(ID).orElse(new Pregunta());
    }

}
