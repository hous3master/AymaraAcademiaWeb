package pe.edu.upc.aaw.aymaraacademia.serviceinterfaces;

import pe.edu.upc.aaw.aymaraacademia.entities.Proyecto;

import java.util.List;

public interface IProyectoService {
    public void insert(Proyecto proyecto);
    List<Proyecto> list();
    public void delete(int ID);
    public void update(Proyecto proyecto);
    public Proyecto listID(int ID);
}
