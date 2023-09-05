package pe.edu.upc.aaw.aymaraacademia.serviceinterfaces;


import pe.edu.upc.aaw.aymaraacademia.entities.UsuarioCurso;

import java.util.List;

public interface IUsuarioCursoService {
    public void insert(UsuarioCurso usuarioCurso);
    List<UsuarioCurso> list();
    void delete(int cursoId, int usuarioId); // Puedes agregar una clase con esta firma o utilizar un ID simple
    void update(UsuarioCurso usuarioCurso);
    public UsuarioCurso listID(int cursoId, int usuarioId);
}
