package pe.edu.upc.aaw.aymaraacademia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.aymaraacademia.entities.Lectura;

@Repository
public interface ILecturaRepository extends JpaRepository<Lectura, Integer> {
}
