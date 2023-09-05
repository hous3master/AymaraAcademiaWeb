package pe.edu.upc.aaw.aymaraacademia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.aymaraacademia.entities.UnidadModulo;

@Repository
public interface IUnidadModuloRepository extends JpaRepository<UnidadModulo, Integer> {
}
