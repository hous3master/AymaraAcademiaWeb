package pe.edu.upc.aaw.aymaraacademia.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.aymaraacademia.entities.Modulo;
import pe.edu.upc.aaw.aymaraacademia.repositories.IModuloRepository;
import pe.edu.upc.aaw.aymaraacademia.serviceinterfaces.IModuloService;

import java.util.List;
@Service
public class ModuloServiceImplement implements IModuloService {

    @Autowired
    private IModuloRepository mR;
    @Override
    public void insert(Modulo modulo) {
        mR.save(modulo);
    }

    @Override
    public List<Modulo> list() {

        return mR.findAll();
    }

    @Override
    public void delete(int ID) {
        mR.deleteById(ID);
    }

    @Override
    public void update(Modulo modulo) {
        mR.save(modulo);
    }

    @Override
    public Modulo listID(int ID) {
        return mR.findById(ID).orElse(new Modulo());
    }
}
