package pe.edu.upc.aaw.aymaraacademia.serviceinterfaces;

import pe.edu.upc.aaw.aymaraacademia.entities.Calificacion;

import java.util.List;

public interface ICalificacionService {

    public void insert(Calificacion calificacion);
    List<Calificacion> list();
    void delete(int proyectoId, int usuarioId); // Puedes agregar una clase con esta firma o utilizar un ID simple
    void update(Calificacion calificacion);

    public Calificacion listID(int proyectoId, int usuarioId);
}
