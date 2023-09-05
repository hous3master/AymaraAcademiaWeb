package pe.edu.upc.aaw.aymaraacademia.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.aymaraacademia.entities.Calificacion;
import pe.edu.upc.aaw.aymaraacademia.repositories.ICalificacionRepository;
import pe.edu.upc.aaw.aymaraacademia.serviceinterfaces.ICalificacionService;

import java.util.List;
@Service
public class CalificacionServiceImplement implements ICalificacionService {
    @Autowired
    private ICalificacionRepository cR;
    @Override
    public void insert(Calificacion calificacion) {
        cR.save(calificacion);
    }

    @Override
    public List<Calificacion> list() {
        return cR.findAll();
    }

    // TO-DO : No sé porque hay un error
    @Override
    public void delete(int proyectoId, int usuarioId) {
        cR.deleteById();
    }

    @Override
    public void update(Calificacion calificacion) {
        cR.save(calificacion);
    }

    @Override
    public Calificacion listID(int proyectoId, int usuarioId) {
        return null;
    }
}
