package lukas.projfinal.service.serviceimpl;

import lukas.projfinal.entity.AngebotEntity;
import lukas.projfinal.entity.AngebotTypEntity;
import lukas.projfinal.entity.SystemsEntity;
import lukas.projfinal.repository.AngebotTypRepository;
import lukas.projfinal.repository.ProduktsRepository;
import lukas.projfinal.repository.SystemsRepository;
import lukas.projfinal.service.AngebotTypService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AngebotTypServiceImpl implements AngebotTypService {

    @Autowired
    private AngebotTypRepository angebotTypRepository;

    @Override
    public List<AngebotTypEntity> getAngebotTyps() {
        return angebotTypRepository.findAll();
    }

    @Override
    public void createAngebotTyp(AngebotTypEntity angebotTyp) {
        angebotTypRepository.save(angebotTyp);
    }

    @Override
    public AngebotTypEntity getAngebotTyp(Long id) {
        return angebotTypRepository.getOne(id);
    }

    @Override
    public void updateAngebotTyp(AngebotTypEntity angebotTyp) {
        angebotTypRepository.save(angebotTyp);
    }

    @Override
    public void deleteAngebotTyp(Long id) {
        angebotTypRepository.deleteById(id);
    }

}
