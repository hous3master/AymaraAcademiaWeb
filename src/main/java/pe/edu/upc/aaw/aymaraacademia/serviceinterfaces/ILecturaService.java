package pe.edu.upc.aaw.aymaraacademia.serviceinterfaces;

import pe.edu.upc.aaw.aymaraacademia.entities.Lectura;

import java.util.List;

public interface ILecturaService {
    public void insert(Lectura lectura);
    List<Lectura> list();
    public void delete(int ID);
    public void update(Lectura lectura);
    public Lectura listID(int ID);
}
