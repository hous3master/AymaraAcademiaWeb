package pe.edu.upc.aaw.aymaraacademia.serviceinterfaces;

import pe.edu.upc.aaw.aymaraacademia.entities.Curso;

import java.util.List;

public interface ICursoService {

    public void insert(Curso curso);
    List<Curso> list();
    public void delete(int ID);
    public void update(Curso curso);
    public Curso listID(int ID);
}
