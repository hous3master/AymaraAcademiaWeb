package pe.edu.upc.aaw.aymaraacademia.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.aymaraacademia.entities.Usuario;
import pe.edu.upc.aaw.aymaraacademia.repositories.IUsuarioRepository;
import pe.edu.upc.aaw.aymaraacademia.serviceinterfaces.IUsuarioService;

import java.util.List;
@Service
public class UsuarioServiceImplement implements IUsuarioService {
    @Autowired
    private IUsuarioRepository uR;
    @Override
    public void insert(Usuario usuario) {
        uR.save(usuario);
    }

    @Override
    public List<Usuario> list() {

        return uR.findAll();
    }

    @Override
    public void delete(int ID) {
        uR.deleteById(ID);
    }

    @Override
    public void update(Usuario usuario) {
        uR.save(usuario);
    }

    @Override
    public Usuario listID(int ID) {

        return uR.findById(ID).orElse(new Usuario());
    }
}
