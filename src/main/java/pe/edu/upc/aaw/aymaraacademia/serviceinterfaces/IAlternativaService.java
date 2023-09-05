package pe.edu.upc.aaw.aymaraacademia.serviceinterfaces;

import pe.edu.upc.aaw.aymaraacademia.entities.Alternativa;

import java.util.List;

public interface IAlternativaService {

    public void insert(Alternativa alternativa);
    List<Alternativa> list();
    public void delete(int ID);
    public void update(Alternativa alternativa);
    public Alternativa listID(int ID);

}
