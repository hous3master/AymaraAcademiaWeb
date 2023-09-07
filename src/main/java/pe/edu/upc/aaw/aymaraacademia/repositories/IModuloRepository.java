package pe.edu.upc.aaw.aymaraacademia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.aymaraacademia.entities.Modulo;

@Repository
public interface IModuloRepository extends JpaRepository<Modulo, Integer> {
}
