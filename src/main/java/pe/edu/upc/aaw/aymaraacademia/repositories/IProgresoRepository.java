package pe.edu.upc.aaw.aymaraacademia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.aymaraacademia.entities.Progreso;

import java.util.Optional;

@Repository
public interface IProgresoRepository extends JpaRepository<Progreso, Integer> {
    void deleteById(Progreso.GroupAssociationKey id);

    Optional<Progreso> findById(Progreso.GroupAssociationKey id);
}
