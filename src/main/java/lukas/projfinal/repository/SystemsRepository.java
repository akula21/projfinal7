package lukas.projfinal.repository;

import lukas.projfinal.entity.SystemsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SystemsRepository extends JpaRepository<SystemsEntity, Long> {
}
