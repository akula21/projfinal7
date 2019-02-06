package lukas.projfinal.repository;

import lukas.projfinal.entity.VerbEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VerbRepository extends JpaRepository<VerbEntity, Long> {
}
