package lukas.projfinal.service.serviceimpl;

import lukas.projfinal.entity.VerbEntity;
import lukas.projfinal.repository.VerbRepository;
import lukas.projfinal.service.VerbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VerbServiceImpl implements VerbService {

    @Autowired
    private VerbRepository verbRepository;

    @Override
    public List<VerbEntity> getVerbs() {
        return verbRepository.findAll();
    }

    @Override
    public void createVerb(VerbEntity order) {
        verbRepository.save(order);
    }

    @Override
    public VerbEntity getVerb(Long id) {
        return verbRepository.getOne(id);
    }

    @Override
    public void updateVerb(VerbEntity order) {
        verbRepository.save(order);
    }

    @Override
    public void deleteVerb(Long id) {
        verbRepository.deleteById(id);
    }


}
