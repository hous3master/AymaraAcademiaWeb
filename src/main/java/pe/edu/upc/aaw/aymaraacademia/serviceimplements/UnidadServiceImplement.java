package pe.edu.upc.aaw.aymaraacademia.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.aymaraacademia.entities.Unidad;
import pe.edu.upc.aaw.aymaraacademia.repositories.IUnidadRepository;
import pe.edu.upc.aaw.aymaraacademia.serviceinterfaces.IUnidadService;

import java.util.List;
@Service
public class UnidadServiceImplement implements IUnidadService {
    @Autowired
    private IUnidadRepository uR;
    @Override
    public void insert(Unidad unidad) {
        uR.save(unidad);
    }

    @Override
    public List<Unidad> list() {
        return uR.findAll();
    }

    @Override
    public void delete(int ID) {
        uR.deleteById(ID);
    }

    @Override
    public void update(Unidad unidad) {
        uR.save(unidad);
    }

    @Override
    public Unidad listID(int ID) {
        return uR.findById(ID).orElse(new Unidad());
    }
}
