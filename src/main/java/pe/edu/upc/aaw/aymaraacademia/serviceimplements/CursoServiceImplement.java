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
    private ICursoRepository cR;

    @Override
    public void insert(Curso curso) {
        cR.save(curso);
    }

    @Override
    public List<Curso> list() {

        return cR.findAll();
    }

    @Override
    public void delete(int ID) {
        cR.deleteById(ID);
    }

    @Override
    public void update(Curso curso) {
        cR.save(curso);
    }

    @Override
    public Curso listID(int ID) {

        return cR.findById(ID).orElse(new Curso());
    }
}
