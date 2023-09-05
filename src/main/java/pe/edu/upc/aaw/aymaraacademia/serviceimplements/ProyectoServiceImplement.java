package pe.edu.upc.aaw.aymaraacademia.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.aymaraacademia.entities.Proyecto;
import pe.edu.upc.aaw.aymaraacademia.repositories.IProyectoRepository;
import pe.edu.upc.aaw.aymaraacademia.serviceinterfaces.IProyectoService;

import java.util.List;
@Service
public class ProyectoServiceImplement implements IProyectoService {
    @Autowired
    private IProyectoRepository pR;
    @Override
    public void insert(Proyecto proyecto) {
        pR.save(proyecto);
    }

    @Override
    public List<Proyecto> list() {

        return pR.findAll();
    }

    @Override
    public void delete(int ID) {
        pR.deleteById(ID);
    }

    @Override
    public void update(Proyecto proyecto) {
        pR.save(proyecto);
    }

    @Override
    public Proyecto listID(int ID) {
        return pR.findById(ID).orElse(new Proyecto());
    }

}
