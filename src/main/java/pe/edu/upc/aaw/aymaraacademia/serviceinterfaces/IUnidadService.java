package pe.edu.upc.aaw.aymaraacademia.serviceinterfaces;

import pe.edu.upc.aaw.aymaraacademia.entities.Unidad;

import java.util.List;

public interface IUnidadService {
    public void insert(Unidad unidad);
    List<Unidad> list();
    public void delete(int ID);
    public void update(Unidad unidad);
    public Unidad listID(int ID);
}
