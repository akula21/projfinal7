package lukas.projfinal.service.serviceimpl;

import lukas.projfinal.entity.AngebotEntity;
import lukas.projfinal.entity.AngebotTypEntity;
import lukas.projfinal.entity.ProduktsEntity;
import lukas.projfinal.entity.SystemsEntity;
import lukas.projfinal.repository.AngebotRepository;
import lukas.projfinal.repository.AngebotTypRepository;
import lukas.projfinal.repository.ProduktsRepository;
import lukas.projfinal.repository.SystemsRepository;
import lukas.projfinal.service.AngebotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AngebotServiceImpl implements AngebotService {

    @Autowired
    private AngebotRepository angebotRepository;


    @Override
    public List<AngebotEntity> getAngebots() {
        return angebotRepository.findAll();
    }

    @Override
    public void createAngebot(AngebotEntity angebot) {
        angebotRepository.save(angebot);
    }

    @Override
    public AngebotEntity getAngebot(Long id) {
        return angebotRepository.getOne(id);
    }

    @Override
    public void updateAngebot(AngebotEntity angebot) {
        angebotRepository.save(angebot);
    }

    @Override
    public void deleteAngebot(Long id) {
        angebotRepository.deleteById(id);
    }

    @Override
    public List<AngebotEntity> findAllActirve() {
        return angebotRepository.findAllByActive(true);
    }


}
