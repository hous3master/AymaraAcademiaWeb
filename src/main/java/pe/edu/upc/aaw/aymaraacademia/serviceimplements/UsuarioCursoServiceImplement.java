package pe.edu.upc.aaw.aymaraacademia.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.aymaraacademia.entities.UsuarioCurso;
import pe.edu.upc.aaw.aymaraacademia.repositories.IUsuarioCursoRepository;
import pe.edu.upc.aaw.aymaraacademia.serviceinterfaces.IUsuarioCursoService;

import java.util.List;

@Service
public class UsuarioCursoServiceImplement implements IUsuarioCursoService {
    @Autowired
    private IUsuarioCursoRepository uR;
    @Override
    public void insert(UsuarioCurso usuarioCurso) {
        uR.save(usuarioCurso);
    }

    @Override
    public List<UsuarioCurso> list() {
        return uR.findAll();
    }

    @Override
    public void delete(int cursoId, int usuarioId) {
        uR.deleteById();
    }

    @Override
    public void update(UsuarioCurso usuarioCurso) {
        uR.save(usuarioCurso);
    }

    @Override
    public UsuarioCurso listID(int cursoId, int usuarioId) {
        return null;
    }
}
