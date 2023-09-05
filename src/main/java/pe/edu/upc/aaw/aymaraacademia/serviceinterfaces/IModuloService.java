package pe.edu.upc.aaw.aymaraacademia.serviceinterfaces;

import pe.edu.upc.aaw.aymaraacademia.entities.Modulo;

import java.util.List;

public interface IModuloService {

    public void insert(Modulo modulo);
    List<Modulo> list();
    public void delete(int ID);
    public void update(Modulo modulo);
    public Modulo listID(int ID);

}
