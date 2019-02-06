package lukas.projfinal.repository;

import lukas.projfinal.entity.AngebotTypEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AngebotTypRepository extends JpaRepository<AngebotTypEntity, Long> {

}
