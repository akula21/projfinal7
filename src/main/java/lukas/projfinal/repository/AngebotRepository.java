package lukas.projfinal.repository;

import lukas.projfinal.entity.AngebotEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AngebotRepository extends JpaRepository<AngebotEntity, Long> {

    List<AngebotEntity> findAllByActive(Boolean b);
}
