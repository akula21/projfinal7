package lukas.projfinal.service.serviceimpl;

import lukas.projfinal.entity.KaefigEntity;
import lukas.projfinal.repository.KaefigRepository;
import lukas.projfinal.service.KaefigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KaefigServiceImpl implements KaefigService {

    @Autowired
    private KaefigRepository kaefigRepository;

    @Override
    public List<KaefigEntity> getKaefigs() {
        return kaefigRepository.findAll();
    }

    @Override
    public void createKaefig(KaefigEntity kaefig) {
        kaefigRepository.save(kaefig);
    }

    @Override
    public KaefigEntity getKaefig(Long id) {
        return kaefigRepository.getOne(id);
    }

    @Override
    public void updateKaefig(KaefigEntity kaefig) {
        kaefigRepository.save(kaefig);
    }

    @Override
    public void deleteKaefig(Long id) {
        kaefigRepository.deleteById(id);
    }
}
