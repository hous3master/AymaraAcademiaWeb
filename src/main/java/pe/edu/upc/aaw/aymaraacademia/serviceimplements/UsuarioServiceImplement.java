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
    private IUsuarioRepository myRepository;

    // Add an item to table
    @Override
    public void insert(Usuario usuario) {
        myRepository.save(usuario);
    }

    // Delete an item by ID on table
    @Override
    public void delete(int idUsuario){
        myRepository.deleteById(idUsuario);
    }

    // Retrieve an items by ID from table
    @Override
    public Usuario listId(int idUsuario){
        return myRepository.findById(idUsuario).orElse(new Usuario());
    }

    // Retrieve all items from table
    @Override
    public List<Usuario> list() {
        return myRepository.findAll();
    }
}
