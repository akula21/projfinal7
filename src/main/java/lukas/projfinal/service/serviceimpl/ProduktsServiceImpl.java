package lukas.projfinal.service.serviceimpl;

import lukas.projfinal.entity.ProduktsEntity;
import lukas.projfinal.repository.ProduktsRepository;
import lukas.projfinal.service.ProduktsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduktsServiceImpl implements ProduktsService {

    @Autowired
    private ProduktsRepository produktsRepository;

    @Override
    public List<ProduktsEntity> getProdukts() {
        return produktsRepository.findAll();
    }

    @Override
    public void createProdukt(ProduktsEntity produkts) {
        produktsRepository.save(produkts);
    }

    @Override
    public ProduktsEntity getProdukt(Long id) {
        return produktsRepository.getOne(id);
    }

    @Override
    public void updateProdukt(ProduktsEntity produkts) {
        produktsRepository.save(produkts);
    }

    @Override
    public void deleteProdukt(Long id) {
        produktsRepository.deleteById(id);
    }
}
