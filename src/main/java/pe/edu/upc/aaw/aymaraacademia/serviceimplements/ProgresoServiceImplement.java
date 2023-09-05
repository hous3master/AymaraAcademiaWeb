package pe.edu.upc.aaw.aymaraacademia.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.events.Event;
import pe.edu.upc.aaw.aymaraacademia.entities.Progreso;
import pe.edu.upc.aaw.aymaraacademia.repositories.IProgresoRepository;
import pe.edu.upc.aaw.aymaraacademia.serviceinterfaces.IProgresoService;

import java.util.List;
@Service
public class ProgresoServiceImplement implements IProgresoService {
    @Autowired
    private IProgresoRepository pR;
    @Override
    public void insert(Progreso progreso) {
        pR.save(progreso);
    }

    @Override
    public List<Progreso> list() {
        return pR.findAll();
    }

    @Override
    public void delete(Progreso.GroupAssociationKey id) {
        pR.deleteById(id);
    }

    @Override
    public void update(Progreso progreso) {
        pR.save(progreso);
    }

    @Override
    public Progreso listID(Progreso.GroupAssociationKey id) {
        return pR.findById(id).orElse(new Progreso());
    }
}
