package pe.edu.upc.aaw.aymaraacademia.serviceinterfaces;

import pe.edu.upc.aaw.aymaraacademia.entities.Progreso;

import java.util.List;

public interface IProgresoService{
    public void insert(Progreso progreso);
    List<Progreso> list();
    public void delete(Progreso.GroupAssociationKey id); // Puedes agregar una clase con esta firma o utilizar un ID simple
    public void update(Progreso progreso);
    public Progreso listID(Progreso.GroupAssociationKey id);

}
