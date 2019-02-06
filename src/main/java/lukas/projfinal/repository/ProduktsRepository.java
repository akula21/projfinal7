package lukas.projfinal.repository;

import lukas.projfinal.entity.ProduktsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduktsRepository extends JpaRepository<ProduktsEntity, Long> {
}
