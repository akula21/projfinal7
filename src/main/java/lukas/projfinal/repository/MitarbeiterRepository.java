package lukas.projfinal.repository;

import lukas.projfinal.entity.MitarbeiterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MitarbeiterRepository extends JpaRepository<MitarbeiterEntity,Long> {
}
