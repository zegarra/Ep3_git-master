package pe.Ep3.Ep3.worldcup_service.infrastructure.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.Ep3.Ep3.worldcup_service.domain.entity.stadium;

@Repository
public interface stadiumRepository extends JpaRepository<stadium,Long> {

}
