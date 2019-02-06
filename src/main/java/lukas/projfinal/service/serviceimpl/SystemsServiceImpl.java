package lukas.projfinal.service.serviceimpl;

import lukas.projfinal.entity.SystemsEntity;
import lukas.projfinal.repository.SystemsRepository;
import lukas.projfinal.service.SystemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemsServiceImpl implements SystemsService {

    @Autowired
    private SystemsRepository systemsRepository;

    @Override
    public List<SystemsEntity> getSystems() {
        return systemsRepository.findAll();
    }

    @Override
    public void createSystem(SystemsEntity systems) {
        systemsRepository.save(systems);
    }

    @Override
    public SystemsEntity getSystem(Long id) {
        return systemsRepository.getOne(id);
    }

    @Override
    public void updateSystem(SystemsEntity systems) {
        systemsRepository.save(systems);
    }

    @Override
    public void deleteSystem(Long id) {
        systemsRepository.deleteById(id);
    }

}
