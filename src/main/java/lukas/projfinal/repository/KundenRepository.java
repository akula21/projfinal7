package lukas.projfinal.repository;


import lukas.projfinal.entity.KundenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KundenRepository extends JpaRepository<KundenEntity, Long> {
}
